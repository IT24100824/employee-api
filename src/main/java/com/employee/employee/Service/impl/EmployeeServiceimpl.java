package com.employee.employee.Service.impl;

import com.employee.employee.Controller.Request.Request;
import com.employee.employee.Controller.Response.Response;
import com.employee.employee.EmployeeService;
import com.employee.employee.model.Employee;
import com.employee.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(Request request) {
        System.out.println(request.getName());

        Employee employee=new Employee();

        employee.setName(request.getName());
        employee.setEmail(request.getEmail());

        employeeRepository.createEmployee(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
