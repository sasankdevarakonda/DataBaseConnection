package com.Neoteric.student.service;

import com.Neoteric.student.model.StudentEntity;
import com.Neoteric.student.repositry.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
  public List<StudentEntity>getStudents(){
      return studentRepository.findAll();

  }
}
