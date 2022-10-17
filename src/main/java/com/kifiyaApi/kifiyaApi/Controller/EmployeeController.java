package com.kifiyaApi.kifiyaApi.Controller;

import com.kifiyaApi.kifiyaApi.Model.Employee;
import com.kifiyaApi.kifiyaApi.Service.EmployeeService;
import com.kifiyaApi.kifiyaApi.Service.HSProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/{emp_id}")
    public Employee getAnEmployee(@PathVariable (name = "emp_id") Long emp_id){
        return employeeService.getOneEmployee(emp_id);
    }

    @PostMapping(path = "/add_new")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping(path = "/{emp_id}")
    public Employee updateEmployee(@PathVariable(name = "emp_id") Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping(path = "/{emp_id}")
    public void deleteEmployee(@PathVariable(name = "emp_id") Long id){
        employeeService.deleteEmployee(id);
    }

}
