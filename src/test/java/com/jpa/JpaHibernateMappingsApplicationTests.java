package com.jpa;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.entity.Course;
import com.jpa.repository.CourseRepository;

@SpringBootTest
class JpaHibernateMappingsApplicationTests {

	@Autowired
	private CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSaveCourse() {
		Course c1 = Course.builder().name("Spring Boot").build();
		Course c2 = Course.builder().name("Microservices").build();
		Course c3 = Course.builder().name("RestAPI").build();
		Course c4 = Course.builder().name("Docker").build();

		courseRepository.saveAll(Arrays.asList(c1, c2, c3, c4));
	}

}
