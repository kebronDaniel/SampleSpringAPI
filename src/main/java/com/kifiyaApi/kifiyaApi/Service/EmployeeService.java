package com.kifiyaApi.kifiyaApi.Service;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee saveEmployee(Employee employee){
        Employee newEmployee = new Employee();
        newEmployee.setName(employee.getName());
        newEmployee.setDescription(employee.getDescription());
        newEmployee.setAge(employee.getAge());
        employeeRepository.save(newEmployee);
        return newEmployee;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getOneEmployee(Long id){
        return employeeRepository.findById(id).get();
    }

    public Employee addEmployee(Employee employee){
        Employee newEmployee = new Employee();
        newEmployee.setName(employee.getName());
        newEmployee.setAge(employee.getAge());
        newEmployee.setDescription(employee.getDescription());
        employeeRepository.save(newEmployee);
        return newEmployee;
    }

    public Employee updateEmployee(Long id, Employee employee){
        Employee foundEmployee;
        foundEmployee = employeeRepository.findById(id).get();
        foundEmployee.setName(employee.getName());
        foundEmployee.setAge(employee.getAge());
        foundEmployee.setDescription(employee.getDescription());
        employeeRepository.save(foundEmployee);
        return foundEmployee;
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }

}
