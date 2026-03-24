package com.employee.employee.Controller;

import com.employee.employee.Controller.Request.Request;
import com.employee.employee.Controller.Response.Response;
import com.employee.employee.EmployeeService;
import com.employee.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public void create(@RequestBody Request request) {
        employeeService.create(request);
        System.out.println("hi");
    }

    @GetMapping("/employees")
    public List<Response> findAll() {



        List<Employee> employeeList = employeeService.findAll();

        List<Response> responseList = new ArrayList<>();

        for (Employee employee : employeeList) {
            Response response = new Response();
            response.setName(employee.getName());
            responseList.add(response);
        }
        return responseList;

    }
}
