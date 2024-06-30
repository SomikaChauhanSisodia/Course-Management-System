
package com.springrest.springrest.services;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;
@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	 public CourseServiceImpl() {
		 list = new ArrayList<>();
		 list.add(new Course(145,"java course","this is java"));
		 list.add(new Course(146,"c++ course","this is c/c++"));
		 list.add(new Course(147,"python course","this is python"));
		 
		 
	 }
	
	@Override
	public List<Course> getcourses(){
		return list;
	}

	@Override
	public Course getcourse(long courseid) {
		// TODO Auto-generated method stub
		Course c = null;
		for(Course co:list) {
			if(co.getId()== courseid) {
				c=co;
				break;
			}
		}
		return c;
				
	}
	@Override
	public Course addcourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updatecourse(Course course) {
		list.forEach(e->{
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
			});
		return course;
	}

	@Override
	public Course deletecourse(long parseLong ) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		return null;
	}
	

}
