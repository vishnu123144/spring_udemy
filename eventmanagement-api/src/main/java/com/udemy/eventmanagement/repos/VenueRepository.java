package com.udemy.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.udemy.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long>{

}
