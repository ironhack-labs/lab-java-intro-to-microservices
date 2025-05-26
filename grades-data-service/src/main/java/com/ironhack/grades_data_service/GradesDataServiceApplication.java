package com.ironhack.grades_data_service;

import com.ironhack.grades_data_service.models.Course;
import com.ironhack.grades_data_service.models.Grade;
import com.ironhack.grades_data_service.repositories.CourseRepository;
import com.ironhack.grades_data_service.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GradesDataServiceApplication implements CommandLineRunner {


	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private GradeRepository gradeRepository;



	public static void main(String[] args) {
		SpringApplication.run(GradesDataServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Course course1 = new Course();
		course1.setCode("C1");
		course1.setName("Mathematics");

		Course course2 = new Course();
		course2.setCode("C2");
		course2.setName("Physics");

		courseRepository.save(course1);
		courseRepository.save(course2);

		Grade grade1 = new Grade();
		grade1.setCourse(course1);
		grade1.setStudentId(2L);
		grade1.setGrade(90);

		Grade grade2 = new Grade();
		grade2.setCourse(course1);
		grade2.setStudentId(3L);
		grade2.setGrade(70);

		Grade grade3 = new Grade();
		grade3.setCourse(course2);
		grade3.setStudentId(4L);
		grade3.setGrade(60);

		Grade grade4 = new Grade();
		grade4.setCourse(course2);
		grade4.setStudentId(5L);
		grade4.setGrade(100);

		gradeRepository.save(grade1);
		gradeRepository.save(grade2);
		gradeRepository.save(grade3);
		gradeRepository.save(grade4);

//		 courseRepository.save(new Course("Course 1", "Description 1"));
//		 gradeRepository.save(new Grade(1, "Student 1", 90));

		System.out.println("Grades Data Service is running...");

		// Add any other initialization logic here

	}
}
