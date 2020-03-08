package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentService {
	public Optional<Student> save(Student student);
	public Optional<Student> findById(Integer id);
	public Optional<List<Student>> getAll();

}
