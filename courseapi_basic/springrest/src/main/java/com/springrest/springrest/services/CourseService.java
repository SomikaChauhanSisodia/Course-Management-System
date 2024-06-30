package com.springrest.springrest.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.springrest.springrest.entity.Course;

@SuppressWarnings("unused")
public interface CourseService {
	public List<Course> getcourses();

	public Course getcourse(long courseid);
	
	public Course addcourse(Course course);
	
	public Course updatecourse(Course course);
	
	public Course deletecourse(long parseLong);
}
