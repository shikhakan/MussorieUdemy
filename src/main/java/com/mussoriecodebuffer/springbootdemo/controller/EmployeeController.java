package com.mussoriecodebuffer.springbootdemo.controller;

import com.mussoriecodebuffer.springbootdemo.MODEL.Employee;
import com.mussoriecodebuffer.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);

    }
}
