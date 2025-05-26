package com.ironhack.student_info_service;

import com.ironhack.student_info_service.models.Student;
import com.ironhack.student_info_service.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentInfoServiceApplication  implements CommandLineRunner {


	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student();
		student1.setName("Alvaro");
		student1.setAge(10);

		Student student2 = new Student();
		student2.setName("Pepe");
		student2.setAge(11);

		Student student3 = new Student();
		student3.setName("Pablo");
		student3.setAge(12);

		Student student4 = new Student();
		student4.setName("Gonzalo");
		student4.setAge(13);

		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);


	}
}
