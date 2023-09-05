package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
