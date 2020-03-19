package com.moonlighttec.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Business Service
public class CourseService {

	@Autowired
	private CourseRespository courseRepository;

	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);

		return courses;
	}
	

	public Course getCourse(String id) {
		Course t = courseRepository.findById(id).get();
		return t;
	}
	

	public void addCourse(Course course) {
		courseRepository.save(course);
	}


	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
