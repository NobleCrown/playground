package com.moonlighttec.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics") // GET method
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Core java", "Core Java Description"),
				new Topic("javascript", "JavaScript", "JavaScript Description")
				);
	}
}
