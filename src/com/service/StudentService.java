package com.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {
	public void add(Student student);
	
	public List<Student> query();

}
