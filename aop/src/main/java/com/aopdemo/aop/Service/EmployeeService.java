package com.aopdemo.aop.Service;

import com.aopdemo.aop.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee createEmployee(String empId, String name , int age){

        // Here I want logging
        Employee employee = new Employee() ;

        employee.setEmpID(empId);
        employee.setName(name);
        employee.setAge(age);

        return employee ;
    }
    public void deleteEmployee(String empID){

    }
}
