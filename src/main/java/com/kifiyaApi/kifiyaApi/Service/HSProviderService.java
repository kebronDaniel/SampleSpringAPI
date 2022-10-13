package com.kifiyaApi.kifiyaApi.Service;

import com.kifiyaApi.kifiyaApi.Model.HealthServiceProvider;
import com.kifiyaApi.kifiyaApi.Repository.HSProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HSProviderService {

    private HSProviderRepository hsProviderRepository;

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
        return hsProviderRepository.findById(id).get();
    }

    public HealthServiceProvider updateProvider(Long id, HealthServiceProvider provider){
        HealthServiceProvider foundProvider;
        foundProvider = hsProviderRepository.findById(id).get();
        foundProvider.setAddress(provider.getAddress());
        foundProvider.setDescription(provider.getDescription());
        foundProvider.setName(provider.getName());
        hsProviderRepository.save(foundProvider);
        return foundProvider;
    }

    public void deleteProvider(Long id){
        hsProviderRepository.deleteById(id);
    }






}
