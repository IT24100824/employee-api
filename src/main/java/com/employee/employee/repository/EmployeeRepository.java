package com.employee.employee.repository;

import com.employee.employee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    List<Employee> employeeList=new ArrayList<>();

    public void createEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee>findAll() {
        return employeeList;
    }
}
