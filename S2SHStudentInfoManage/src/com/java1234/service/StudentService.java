package com.java1234.service;

import java.util.List;

import com.java1234.model.PageBean;
import com.java1234.model.Student;

public interface StudentService {

	public List<Student> studentList(PageBean pageBean,Student student,String bbirthday,String ebirthday)throws Exception;
	
	public int studentCount(Student student,String bbirthday,String ebirthday)throws Exception;
	
	public int studentDelete(String delIds)throws Exception;
	
	public int studentSave(Student student)throws Exception;
	
	public boolean getStudentByGradeId(String gradeId)throws Exception;
}
