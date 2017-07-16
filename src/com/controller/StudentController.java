package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.entity.Student;
import com.service.StudentService;

@Controller
@SessionAttributes("user")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path="/regist")
	public String regist(HttpServletRequest request,Student student,Model model){
		String name=request.getParameter("name");
		String pwd=request.getParameter("password");
		student.setName(name);
		student.setPassword(pwd);
		studentService.add(student);
		
		System.out.println(1111);
		model.addAttribute("success", "success");
		System.out.println(22222);
		return "forward:/showLogin";
	}

}
