package com.udemy.eventmanagement.repos;


import java.time.ZoneId;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.udemy.eventmanagement.entities.Event;
import com.udemy.eventmanagement.entities.projections.PartialEventProjection;
@RepositoryRestResource(excerptProjection = PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long>{

	Page<Event> findByName(@Param("name")String name,Pageable pageble);
	Page<Event> findByNameAndZoneId(@Param("name")String name,@Param("zoneId")ZoneId zoneId,Pageable pageble);
	
}
