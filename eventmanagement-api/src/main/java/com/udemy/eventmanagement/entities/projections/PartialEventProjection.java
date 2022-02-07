package com.udemy.eventmanagement.entities.projections;

import java.time.Instant;
import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import com.udemy.eventmanagement.entities.Event;

@Projection(name="partial",types = { Event.class })
public interface PartialEventProjection {
	
	String getName();
	ZonedDateTime getStartTime();
	ZonedDateTime getEndTime();
	Instant getCreated();

}
