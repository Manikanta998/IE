package com.sn.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    ImplStudentService service;
    List<Student> studentList=new ArrayList<Student>();
    @RequestMapping("/home")
    public ModelAndView Home() {
        return new ModelAndView("index");
    }
    @RequestMapping("/Insert.html")
    public ModelAndView defectDetails() {
        return new ModelAndView("Insert");
    }

    @RequestMapping("/insertOutput")
public ModelAndView  inserting(HttpServletRequest request, HttpServletResponse response){
    ModelAndView mv = new ModelAndView();
int id = Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String address=request.getParameter("address");
Student s1= new Student( id,name,address);
String s=service.studentRegister(s1);
mv.addObject("inserted",s);
return new ModelAndView("InsertOutput");
    }
// =======================================================================================
@RequestMapping("/Update.html")
public ModelAndView update() {
    return new ModelAndView("Update");
}

    @RequestMapping("/updateOutput")
    public ModelAndView  updating(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        Student s1= new Student( id,name,address);
        String s=service.studentRegister(s1);
        mv.addObject("updated",s);
        return new ModelAndView("Updateaoutput");
    }
    // =======================================================================================
    @RequestMapping("/Read.html")
    public ModelAndView read() {
        return new ModelAndView("Read");
    }

    @RequestMapping("/readOutput")
    public ModelAndView  reading(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));


        String s=service.studentread(id);
        System.out.println(s);
        mv.addObject("read",s);
        mv.setViewName("ReadOutput.html");
        return  mv;
    }

}
