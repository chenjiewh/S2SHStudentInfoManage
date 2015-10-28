package com.java1234.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.GradeDao;
import com.java1234.model.Grade;
import com.java1234.model.PageBean;
import com.java1234.service.GradeService;

@Service
public class GradeServiceImpl implements GradeService{

	@Resource
	private GradeDao gradeDao;
	
	@Override
	public List<Grade> gradeList(PageBean pageBean, Grade grade)
			throws Exception {
		return gradeDao.gradeList(pageBean, grade);
	}

	@Override
	public int gradeCount(Grade grade) throws Exception {
		return gradeDao.gradeCount(grade);
	}

	@Override
	public int gradeDelete(String delIds) throws Exception {
		return gradeDao.gradeDelete(delIds);
	}

	@Override
	public int gradeSave(Grade grade) throws Exception {
		return gradeDao.gradeSave(grade);
	}

	@Override
	public Grade getGradeById(int gradeId) throws Exception {
		return gradeDao.getGradeById(gradeId);
	}

}
