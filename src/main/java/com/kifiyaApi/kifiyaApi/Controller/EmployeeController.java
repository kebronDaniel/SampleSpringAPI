package com.kifiyaApi.kifiyaApi.Controller;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Service.EmployeeService;
import com.kifiyaApi.kifiyaApi.Service.HSProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/employee/")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "{emp_id}")
    public Employee getAnEmployee(@PathVariable (name = "emp_id") Long emp_id){
        return employeeService.getOneEmployee(emp_id);
    }

}
