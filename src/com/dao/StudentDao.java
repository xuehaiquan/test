package com.dao;

import java.util.List;

import com.entity.Student;

public interface StudentDao {
	
	public void insert(Student student);
	
	public List<Student> select();

}
