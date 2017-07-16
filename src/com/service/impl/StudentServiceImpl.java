package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.entity.Student;
import com.service.StudentService;

@Service
@Transactional(rollbackFor=Exception.class)
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentdao;
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentdao.insert(student);
	}
	
	
	

}
