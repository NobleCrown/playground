package com.moonlighttec.topic;

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

@RestController
public class TopicController {

	@Autowired // TopicService wurde schon intialisiert und muss dadurch nicht wieder
				// initalisiert werden, wird einfach von hier auf dort zugegriffen.
	private TopicService topicService;

	/** GET-Methods */

	@RequestMapping("/topics") // by default-GET method
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

//	@RequestMapping("/topics/{id}") // GET method, {} werden ids markiert
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) { // damit sagen wir, dass id dem id aus dem path entspricht
		return topicService.getTopic(id);
	}

	/** POST-Methods */

//	@RequestMapping(method=RequestMethod.POST, value="/topics")
	@PostMapping(value = "/topics")
	public void addTopic(@RequestBody Topic topic) { // Um den Body-Inhalt zu erhalten
		System.out.println("POST: " + topic.toString());
		topicService.addTopic(topic);
	}

	/** PUT (Update)-Methods */

	@PutMapping(value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		System.out.println("PUT: " + topic.toString());
		topicService.updateTopic(id, topic);
	}

	/** DELETE-Methods */

	@DeleteMapping(value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);

	}

}