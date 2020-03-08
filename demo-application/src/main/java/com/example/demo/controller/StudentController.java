package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "student",method = RequestMethod.POST)
	public ResponseEntity<Student> save(@RequestBody Student student){		
		Optional<Student> optional = studentService.save(student);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(optional.get());
	}
	
	@RequestMapping(value = "student",method = RequestMethod.PUT)
	public ResponseEntity<Student> update(@RequestBody Student student){		
		Optional<Student> optional = studentService.save(student);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(optional.get());
	}
	
	@RequestMapping(value = "student/{id}",method = RequestMethod.GET)
	public ResponseEntity<Student> get(@PathVariable(value = "id") Integer id){		
		Optional<Student> optional = studentService.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(optional.get());
	}
	
	@RequestMapping(value = "student/all",method = RequestMethod.GET)
	public ResponseEntity<List<Student>> get(){		
		Optional<List<Student>> optional = studentService.getAll();
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(optional.get());
	}
}
