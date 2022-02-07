package com.udemy.aop.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Dao2 {
	
	public String retrieveSomething(){
		return "Dao2";
	}
	
}
