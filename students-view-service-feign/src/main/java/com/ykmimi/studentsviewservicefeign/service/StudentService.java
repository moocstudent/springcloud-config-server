package com.ykmimi.studentsviewservicefeign.service;

import com.ykmimi.studentsviewservicefeign.bean.Student;
import com.ykmimi.studentsviewservicefeign.client.StudentClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentClientFeign studentClientFeign;

    public List<Student> listStudents(){
        return studentClientFeign.listStudents();
    }
}
