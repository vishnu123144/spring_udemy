package com.udemy.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.udemy.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long>{

}
