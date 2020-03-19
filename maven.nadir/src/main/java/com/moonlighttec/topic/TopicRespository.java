package com.moonlighttec.topic;

import org.springframework.data.repository.CrudRepository;

/*
 *  Unser Dataservice, Spring bringt schon Crud mit, mit allen Befehlen die wir brauchen.
 *  Müssen nur noch Klassen- und ID-Typ bestimmen.
 */
public interface TopicRespository extends CrudRepository<Topic, String> {

	
}
