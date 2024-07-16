package com.example.Microlab;

import com.example.Microlab.model.Student;
import com.example.Microlab.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(StudentRepository studentRepository) {
		return args -> {

		studentRepository.save(new Student("PR-001", "RobotAlpha", "900 days"));
		studentRepository.save(new Student("PR-002", "RobotBeta", " 600 days"));
		studentRepository.save(new Student("PR-003", "RobotGamma", "300 days"));
		studentRepository.save(new Student("PR-004", "RobotDelta", "70 days"));
		};
	}

}
