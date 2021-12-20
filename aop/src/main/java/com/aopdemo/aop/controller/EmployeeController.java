package com.aopdemo.aop.controller;

import com.aopdemo.aop.Service.EmployeeService;
import com.aopdemo.aop.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService ;

    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Employee acceptEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee.getEmpID(),employee.getName(),employee.getAge()) ;
    }
    @DeleteMapping(value = "/employees/{id}")
    public String removeEmp(@PathVariable(name = "id") String empID){
        employeeService.deleteEmployee(empID);
        return "Employee Removed" ;
    }

}
