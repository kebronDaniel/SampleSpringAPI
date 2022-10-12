package com.kifiyaApi.kifiyaApi.Service;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
