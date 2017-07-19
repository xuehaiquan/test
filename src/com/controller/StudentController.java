package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.entity.Student;
import com.service.StudentService;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

@Controller

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
	
	@RequestMapping(path="/query")
	public void queryAll(HttpServletRequest request,HttpServletResponse response){
		List<Student>lists=new ArrayList<Student>();
		lists=studentService.query();
		for(Student list:lists){
			System.out.println(list.getName());
		}
		JSONArray json=JSONArray.fromObject(lists.toArray());
		PrintWriter out=null;
		try {
			out = response.getWriter();
			out.print(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
	

}
