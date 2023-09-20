package com.jpa.repository;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.entity.Course;
import com.jpa.entity.Passport;
import com.jpa.entity.Review;
import com.jpa.entity.Student;

@SpringBootTest
public class AddDataToAllTables {

  @Autowired
  private CourseRepository courseRepository;
  @Autowired
  private StudentRepository studentRepository;
  @Autowired
  private PassportRepository passportRepository;
  @Autowired
  private ReviewRepository reviewRepository;

  @Test
  public void manyToOneMappingBetweenReviewAndCourse() {
    Course c1 = Course.builder().name("Spring Boot").build();
    Course c2 = Course.builder().name("Microservices").build();
    Course c3 = Course.builder().name("RestAPI").build();
    Course c4 = Course.builder().name("Docker").build();
    Course c5 = Course.builder().name("K8s").build();

    Review r1 = Review.builder().rating("5").description("Great course").course(c1).build();
    Review r2 = Review.builder().rating("5").description("Great course").course(c1).build();
    Review r3 = Review.builder().rating("5").description("Great course").course(c1).build();
    Review r4 = Review.builder().rating("4").description("Must learn").course(c3).build();
    Review r5 = Review.builder().rating("4").description("Must learn").course(c3).build();

    reviewRepository.saveAll(Arrays.asList(r1, r2, r3, r4, r5));
    courseRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
  }

  @Test
  public void oneToOneMappingBetweenPassportAndStudent() {
    Passport p1 = Passport.builder().passportNumber("ASD135").build();
    Passport p2 = Passport.builder().passportNumber("HJU869").build();
    Passport p3 = Passport.builder().passportNumber("IYT037").build();
    Passport p4 = Passport.builder().passportNumber("TYU238").build();
    Passport p5 = Passport.builder().passportNumber("PEU539").build();

    Student s1 = Student.builder().name("Sai").passport(p1).build();
    Student s2 = Student.builder().name("Manda").passport(p2).build();
    Student s3 = Student.builder().name("sastri").passport(p3).build();
    Student s4 = Student.builder().name("Pb").passport(p4).build();
    Student s5 = Student.builder().name("Katravalli").passport(p5).build();

    studentRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5));
  }
}
