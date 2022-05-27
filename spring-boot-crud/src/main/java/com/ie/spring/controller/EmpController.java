package com.ie.spring.controller;

import com.ie.spring.model.Employee;
import com.ie.spring.sevice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/employee")
    private List<Employee> getAllEmployee() {
        return empService.getAllEmployee();
    }

    @GetMapping("/employee/{employeeid}")
    private Employee getEmployee(@PathVariable("employeeid") int employeeid) {
        return empService.getEmployeeById(employeeid);
    }

    @DeleteMapping("/employee/{employeeid}")
    private void deleteBook(@PathVariable("employeeid") int employeeid) {
        empService.delete(employeeid);
    }

    @PostMapping("/employee")
    private int saveBook(@RequestBody Employee employee) {
        empService.saveOrUpdate(employee);
        return employee.getId();
    }

    @PutMapping("/employee")
    private Employee update(@RequestBody Employee employee) {
        empService.saveOrUpdate(employee);
        return employee;
    }
}

