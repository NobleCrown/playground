package com.moonlighttec.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moonlighttec.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	/** GET-Methods */

	@RequestMapping("/topics/{id}/courses") // by default-GET method
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

//	@RequestMapping("/topics/{id}") // GET method, {} werden ids markiert
	@GetMapping("/topics/{topicId}/courses/{ID}")
	public Course getCourse(@PathVariable String id) { // damit sagen wir, dass id dem id aus dem path entspricht
		return courseService.getCourse(id);
	}

	/** POST-Methods */

//	@RequestMapping(method=RequestMethod.POST, value="/topics")
	@PostMapping(value = "/topics/{topicID}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) { // Um den Body-Inhalt zu erhalten
		course.setTopic(new Topic (topicId, "",""));
		courseService.addCourse(course);
	}

	/** PUT (Update)-Methods */

	@PutMapping(value = "/topics/{topicID}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId) {
		course.setTopic(new Topic (topicId, "",""));
		courseService.updateCourse(course);
	}

	/** DELETE-Methods */

	@DeleteMapping(value = "/topics/{topicID}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);

	}

}