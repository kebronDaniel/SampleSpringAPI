package com.kifiyaApi.kifiyaApi.Service;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Model.HealthServiceProvider;
import com.kifiyaApi.kifiyaApi.Repository.EmployeeRepository;
import com.kifiyaApi.kifiyaApi.Repository.HSProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HSProviderService {

    private HSProviderRepository hsProviderRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Autowired
    public void setHsProviderRepository(HSProviderRepository hsProviderRepository) {
        this.hsProviderRepository = hsProviderRepository;
    }

    public HealthServiceProvider addHealthServiceProvider (HealthServiceProvider provider){
        return hsProviderRepository.save(provider);
    }

    public List<HealthServiceProvider> getAllProviders(){
        return hsProviderRepository.findAll();
    }

    public HealthServiceProvider getOneProvider(Long id){
        HealthServiceProvider foundProvider;
        foundProvider = hsProviderRepository.findById(id).get();
        System.out.println(foundProvider.getEmployees());
        return foundProvider;
    }

    public HealthServiceProvider updateProvider(Long id, HealthServiceProvider provider){
        HealthServiceProvider foundProvider;
        foundProvider = hsProviderRepository.findById(id).get();
        List<Employee> employees;
        if (foundProvider != null){
            foundProvider.setName(provider.getName());
            foundProvider.setLocation(provider.getLocation());
            foundProvider.setDescription(provider.getDescription());
            foundProvider.setEmail(provider.getEmail());
            foundProvider.setPhone_number(provider.getPhone_number());
            foundProvider.setEmployees(provider.getEmployees());
        }
        hsProviderRepository.save(foundProvider);
        return foundProvider;
    }

    public void deleteProvider(Long id){
        hsProviderRepository.deleteById(id);
    }






}
