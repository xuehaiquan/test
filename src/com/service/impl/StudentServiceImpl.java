package com.service.impl;

import java.util.ArrayList;
import java.util.List;

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
	@Override
	public List<Student> query() {
		List<Student> stus=new ArrayList<Student>();
		stus=studentdao.select();
		return stus;
	}
	
	
	

}
