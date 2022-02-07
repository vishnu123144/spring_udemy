package com.udemy.eventmanagement.repos;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.udemy.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long>{

}