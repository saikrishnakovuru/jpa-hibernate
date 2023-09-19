package com.jpa.repository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.entity.Course;

@SpringBootTest
public class CourseRepositoryTest {
  @Autowired
  private CourseRepository courseRepository;

  @Test
  public void deleteCourseById() {
    Optional<Course> courseToDelete = courseRepository.findById(256L);
    courseToDelete.ifPresent(course -> courseRepository.delete(course));
  }
}
