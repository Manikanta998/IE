package com.ie.spring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class MyService {

    private static Map<Integer, Employee> employee = new HashMap();
    private static int index = 2;

    static {
        Employee em1 = new Employee("latha", 12000, "dev");
        Employee em2 = new Employee("reddy", 13000, "DEv");
        employee.put(1, em1);
        employee.put(2, em2);
    }

    public static List<Employee> getAllEmployee() {
        return new ArrayList<Employee>(employee.values());
    }

    public static Employee getEmployeeDetails(int id) {

        return employee.get(id);
    }

    public static Employee addEmployee(Employee employe) {
        index += 1;
        employe.setId(index);
        employee.put(index, employe);
        return (Employee) employee;
    }

    public static Employee updateEmployee(int id, Employee emp) {
        emp.setId(id);
        employee.put(id, emp);
        return (Employee) employee;
    }

    public static Employee deleteEmployee(int id) {
        return employee.get(id);
    }

}


