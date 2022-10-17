package com.kifiyaApi.kifiyaApi.Service;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> getAllEmployees(){
        List<Employee>allEmployees;
        allEmployees = employeeRepository.findAll();
//        for (Employee employee: allEmployees
//             ) {
//            if (employee.getProvider() == null){
//                employeeRepository.delete(employee);
//            }
//        }
        return allEmployees;
    }

    public Employee getOneEmployee(Long id){
        return employeeRepository.findById(id).get();
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee){
        Employee foundEmployee;
        foundEmployee = employeeRepository.findById(id).get();
        System.out.println("got the employee");
        System.out.println(foundEmployee);
        foundEmployee.setName(employee.getName());
        foundEmployee.setEmail(employee.getEmail());
        foundEmployee.setAge(employee.getAge());
        foundEmployee.setGender(employee.getGender());
        foundEmployee.setAddress(employee.getAddress());
        //TODO enable to change a provider from here.
        employeeRepository.save(foundEmployee);
        System.out.println("-------After the change ----------");
        System.out.println(foundEmployee);
        return foundEmployee;
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

}
