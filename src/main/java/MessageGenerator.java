package com.aonesolutions;
 
import org.springframework.stereotype.Component;

@Component
public class MessageGenerator {

	public String getWelcomeMessage() {
		return "welcome"; 
	}
 
}