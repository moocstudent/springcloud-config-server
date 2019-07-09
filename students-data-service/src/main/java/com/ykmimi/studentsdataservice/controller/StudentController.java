package com.ykmimi.studentsdataservice.controller;

import com.ykmimi.studentsdataservice.bean.Student;
import com.ykmimi.studentsdataservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public Object students(){
        List<Student> studentList = studentService.listStudents();
        return studentList;
    }
}
