package com.java1234.dao;

import java.util.List;

import com.java1234.model.Grade;
import com.java1234.model.PageBean;

public interface GradeDao {

	public List<Grade> gradeList(PageBean pageBean,Grade grade)throws Exception;
	
	public int gradeCount(Grade grade)throws Exception;
	
	public int gradeDelete(String delIds)throws Exception;
	
	public int gradeSave(Grade grade)throws Exception;
	
	public Grade getGradeById(int gradeId)throws Exception;
}
