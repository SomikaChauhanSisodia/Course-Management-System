
package com.springrest.springrest.services;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.coursedao;
import com.springrest.springrest.entity.Course;
@SuppressWarnings("unused")
@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private coursedao courda;
	
	@Override
	public List<Course> getcourses(){
		return courda.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getcourse(long courseid) {
		

		return courda.getOne(courseid);
				
	}
	@Override
	public Course addcourse(Course course) {
		courda.save(course);
		return course;
	}

	@Override
	public Course updatecourse(Course course) {
		courda.save(course);
		return course;
	}

	@Override
	public void deletecourse(long parseLong ) {
		@SuppressWarnings("deprecation")
		Course entity =courda.getOne(parseLong);
		courda.delete(entity);
	}
	

}
