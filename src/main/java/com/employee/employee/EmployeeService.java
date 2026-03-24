package com.employee.employee;

import com.employee.employee.Controller.Request.Request;
import com.employee.employee.Controller.Response.Response;
import com.employee.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    void create(Request request);
    List<Employee> findAll();


}
