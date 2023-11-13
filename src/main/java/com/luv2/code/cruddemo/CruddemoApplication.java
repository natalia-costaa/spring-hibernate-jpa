package com.luv2.code.cruddemo;

import com.luv2.code.cruddemo.dao.StudentDAO;
import com.luv2.code.cruddemo.dao.StudentDAOImpl;
import com.luv2.code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			queryForStudents(studentDAO);
		};

	}

//	public void queryForStudentsByLastName(StudentDAO studentDAO) {
//
//		// get the list of students
//		List<Student> theStudents = studentDAO.findByLastName("Duck");
//
//		for (Student tempStudent : theStudents) {
//			System.out.println(tempStudent);
//		}
//	}

	public void queryForStudents(StudentDAO studentDAO) {

		// get the list of students
		List<Student> theStudents = studentDAO.findAll();

		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

//	private void readStudent(StudentDAO studentDAO) {
//
//		System.out.println("Creating new student object...");
//		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");
//
//		// save the student object
//		System.out.println("Saving the student...");
//		studentDAO.save(tempStudent);
//
//		// display id of the saved student
//		System.out.println("Saved student. Generated id: " + tempStudent.getId());
//
//		// retrieve student based on the id: primary key
//		System.out.println("\nRetrieving student with id: " + tempStudent.getId());
//		Student myStudent = studentDAO.findById(tempStudent.getId());
//		System.out.println("Found the student: " + myStudent);
//
//	}

//	private void createMultipleStudent(StudentDAO studentDAO) {
//
//		// create multiple students
//		System.out.println("Creating 3 Student Object...");
//		Student tempStudent1 = new Student("John", "Doe", "paul@luv2code.com");
//		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
//		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
//
//		// save the student object
//		System.out.println("Saving the Student...");
//		studentDAO.save(tempStudent1);
//		studentDAO.save(tempStudent2);
//		studentDAO.save(tempStudent3);
//
//		// display id of the saved student
//		System.out.println("Saved student. Generated id: " + tempStudent1.getId());
//		System.out.println("Saved student. Generated id: " + tempStudent2.getId());
//		System.out.println("Saved student. Generated id: " + tempStudent3.getId());

//	private void createStudent(StudentDAO studentDAO) {
//
//		// create the student object
//		System.out.println("Creating new Student Object...");
//		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");
//
//		// save the student object
//		System.out.println("Savinf the Student...");
//		studentDAO.save(tempStudent);
//
//		// display id of the saved student
//		System.out.println("Saved student. Generated id: " + tempStudent.getId());
//
//	}


}
