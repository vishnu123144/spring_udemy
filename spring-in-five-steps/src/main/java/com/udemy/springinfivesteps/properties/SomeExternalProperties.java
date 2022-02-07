package com.udemy.springinfivesteps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalProperties {
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceUrl() {
		return url;
	}

}
