package com.ie.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {
    @Autowired
    Employee employee;
    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return MyService.getAllEmployee();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployeeList(@PathVariable("id") int emid) {
        return MyService.getEmployeeDetails(emid);
    }

    @PostMapping("/employees")
    public Employee addEmployee( Employee employee) {
        return MyService.addEmployee(employee);
    }
    @PutMapping("/employees")
    public Employee updateEmployee( @RequestBody Employee employee,int id) {
        return MyService.updateEmployee(id,employee);
    }

    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee( int emid) {
        return MyService.deleteEmployee(emid);
    }


}
