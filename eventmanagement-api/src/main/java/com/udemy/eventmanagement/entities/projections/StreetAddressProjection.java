package com.udemy.eventmanagement.entities.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.udemy.eventmanagement.entities.Venue;

@Projection(name="virtual",types = { Venue.class })
public interface StreetAddressProjection {
    
    @Value("#{target.streetAddress} #{target.streetAddress2}")
	String getCompleteStreetAddress();
}
