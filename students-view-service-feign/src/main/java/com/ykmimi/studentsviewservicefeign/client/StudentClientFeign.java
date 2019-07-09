package com.ykmimi.studentsviewservicefeign.client;

import com.ykmimi.studentsviewservicefeign.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "STUDENTS-DATA-SERVICE")
@Component
public interface StudentClientFeign {
    @GetMapping("/students")
    public List<Student> listStudents();
}
