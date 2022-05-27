package com.ie.spring.sevice;

import com.ie.spring.model.Employee;
import com.ie.spring.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;
    public List<Employee> getAllEmployee(){
        List<Employee> employee = new ArrayList<>();
        empRepository.findAll().forEach(employee1 -> employee.add(employee1));
        return employee;
    }
    public Employee getEmployeeById(int id){
        return empRepository.findById(id).get();
    }
    public void saveOrUpdate(Employee employee){
        empRepository.save(employee);
    }
    public void delete(int id){
        empRepository.deleteById(id);
    }
    public void update(Employee employee,int employeeId){
        empRepository.save(employee);
    }
}
