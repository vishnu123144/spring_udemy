package com.udemy.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.eventmanagement.entities.Event;
import com.udemy.eventmanagement.repos.EventRepository;

@RepositoryRestController
public class EventKickOffController {
//	@Autowired
//	private EventRepository eventRepository;
//
//	@PostMapping("/start/{id}")
//	public ResponseEntity start(@PathVariable Long id) {
//	
//		Event event=eventRepository.findOne(id)
//		event.setStarted(true);
//		eventRepository.save(event);
//		
//		return ResponseEntity.ok(event.getName()+ "has started");
	//}
}
