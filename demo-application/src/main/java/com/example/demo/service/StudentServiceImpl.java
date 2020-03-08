package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repos.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;

	@Override
	public Optional<Student> save(Student student) {
		student = studRepo.save(student);
		return Optional.of(student);
	}

	@Override
	public Optional<Student> findById(Integer id) {
		return studRepo.findById(id);
	}

	@Override
	public Optional<List<Student>> getAll() {
		return Optional.of(studRepo.findAll());
	}

}
