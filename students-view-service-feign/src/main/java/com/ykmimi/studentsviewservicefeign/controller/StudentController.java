package com.ykmimi.studentsviewservicefeign.controller;

import com.ykmimi.studentsviewservicefeign.bean.Student;
import com.ykmimi.studentsviewservicefeign.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public Object students(Model m){
        List<Student> students = studentService.listStudents();
        m.addAttribute("students",students);
        return "students";
    }
}
