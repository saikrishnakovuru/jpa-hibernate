package com.jpa.repository;

import com.jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class StudentRepositoryTest {
  @Autowired
  private StudentRepository studentRepository;


}
