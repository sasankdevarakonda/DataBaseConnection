package com.Neoteric.student.controller;

import com.Neoteric.student.model.StudentEntity;
import com.Neoteric.student.service.StudentService;
import com.Neoteric.student.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping(value = "/getStudents")
    public  List<StudentEntity>getstudents(){
        return studentService.getStudents();
    }
    @GetMapping(value = "/getTeachercount")
    public int getTeachercount(){
        schoolService ss=new schoolService();
        return ss.getTeachercount();
    }
    @GetMapping(value = "/getadd")
    public int getadd(){
       schoolService ss=new schoolService();
      return ss.getadd();
    }
    @GetMapping(value = "/getremove")
    public int getremove(){
        schoolService ss=new schoolService();
        return ss.getremove();
    }

    }


