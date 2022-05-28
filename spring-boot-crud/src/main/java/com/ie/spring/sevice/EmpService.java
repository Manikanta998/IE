package com.ie.spring.sevice;

import com.ie.spring.model.Mani;
import com.ie.spring.repository.EmpRepository;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;
    public List<Mani> getAllEmployee(){
        List<Mani> employee = new ArrayList<>();
        empRepository.findAll().forEach(employee1 -> employee.add(employee1));
        return employee;
    }
    public Mani getEmployeeById(int id){
        return empRepository.findById(id).get();
    }
    public void saveOrUpdate(Mani employee){
        empRepository.save(employee);
    }
    public void delete(){
        empRepository.deleteAll();
    }
    public void update(Mani employee, int employeeId){
        empRepository.save(employee);
    }
}
