package com.udemy.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.udemy.eventmanagement.controller.exceptions.AlreadyCheckedInException;
import com.udemy.eventmanagement.entities.Participant;
import com.udemy.eventmanagement.repos.ParticipantRepository;

@RepositoryRestController
public class CheckInController {
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	
//	public ResponseEntity<Participant> checkIn(@PathVariable Long id){
//		//PersistantEntityResourceAssembler assembler
//    	Participant participant=participantRepository.findOne(id);
//		if(participant!=null) {
//			if(participant.getCheckedIn()) {
//			throw new AlreadyCheckedInException();
//			}
//			
//			participant.setCheckedIn(true);
//			participantRepository.save(participant);
//		}
//		
//		return ResponseEntity.ok(participant);
	//}

}
