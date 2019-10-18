package tm.SpringBootRestApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.SpringBootRestApi.entities.Student;
import tm.SpringBootRestApi.repositories.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping("/test")
	public String test(){
		return "This is test";
	}
	
	@RequestMapping("/students")
	public Iterable<Student> getStudents(){
		return studentRepository.findAll();
	}

}
