package com.moonlighttec.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Business Service
public class TopicService {
	
	@Autowired
	private TopicRespository topicRepository;
	
//	// Hardcoded List
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("spring", "Spring Framework", "Spring Framework Description"),
//			new Topic("java", "Core java", "Core Java Description"),
//			new Topic("javascript", "JavaScript", "JavaScript Description")
//			));
//	
	
	/**
	 * Listenaufruf upgraded mit JPA
	 * @return Liste von Topics
	 */
	public List<Topic> getAllTopics() {
//		return this.topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	/**
	 * 
	 * @param id Vom Topic das man sucht
	 * @return
	 */
	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Topic t = topicRepository.findById(id).get();	
		return t;
	}
	
	/**
	 * Hinzufügen von einem Topic mit JPA
	 * @param fügt eine neue topic dem DB hinzu
	 */
	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
	}

	/**
	 * 
	 * @param id vom Topic, dass man ändern möchte
	 * @param topic Inhalt der Änderung, die man übergeben möchte im Body
	 */
	public void updateTopic(String id, Topic topic) {
//		 for (int i = 0; i < topics.size(); i++) {
//			 Topic t = topics.get(i);
//			 if (t.getId().equals(id)) {
//				 topics.set(i, topic);
//				 return;
//			 }
//		 }
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}

}
