package com.ie.spring.controller;

import com.ie.spring.model.Mani;
import com.ie.spring.sevice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/employee")
    private List<Mani> getAllEmployee() {
        return empService.getAllEmployee();
    }

    @GetMapping("/employee/{employeeid}")
    private Mani getEmployee(@PathVariable("employeeid") int employeeid) {
        return empService.getEmployeeById(employeeid);
    }

    @DeleteMapping("/employee/")
    private void deleteEmployee() {
        empService.delete();
    }

    @PostMapping("/employee")
    private int saveEmployee(@RequestBody Mani employee) {
        empService.saveOrUpdate(employee);
        return employee.getId();
    }

    @PutMapping("/employee")
    private Mani update(@RequestBody Mani employee) {
        empService.saveOrUpdate(employee);
        return employee;
    }
}

