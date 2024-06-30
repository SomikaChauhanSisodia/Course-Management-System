somika com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	public String home(){
		return "commmmeeee";
	}
	//get the courses
	@GetMapping("/courses")
	public List<Course> getcourses(){
		
		return this.courseservice.getcourses();
	}
	@GetMapping("/courses/{courseid}")
    public Course getcourse(@PathVariable String courseid) {
		return this.courseservice.getcourse(Long.parseLong(courseid));
	}
	
	@PostMapping("/courses")
		public Course addcourse(@RequestBody Course course) {
			return this.courseservice.addcourse(course);
		}
	
	@PutMapping("/courses")
	public Course updatecourse(@RequestBody Course course) {
		return this.updatecourse(course);
	}
	
	@DeleteMapping("/courses/{courseid}")
	public void deletecourse(@PathVariable String courseid) {
			this.courseservice.deletecourse(Long.parseLong(courseid));

	}
	
}
