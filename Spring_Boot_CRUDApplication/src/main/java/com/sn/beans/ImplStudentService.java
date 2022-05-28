package com.sn.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImplStudentService implements StudentMantService{
    @Autowired
Student student;
    @Autowired
    private ImplRepo repo;
    @Override
    public String studentRegister(Student student) {
Student student1=repo.save(student);
return "the values of Student id from the table is :"+student1.getId();
    }
    public String stundentDelet(int id){

        repo.deleteById(id);
        return "successfully deleted student having  :"+id;
    }
    public String studentread(int id){
      Optional<Student> student=  repo.findById(id);

      return "details"+student.toString();
    }

    public String studentUpdate(int id,String name,String address){
        if(student.getId()==id){
            student.setName(name);
student.setAddress(address);        }
        else
            return "records not found";
        return "details"+student.toString();
    }
}
