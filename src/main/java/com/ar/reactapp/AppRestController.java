package com.ar.reactapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/v1")
public class AppRestController {
	
	
	@GetMapping("/users")
	public ResponseEntity<?> usersList() throws JsonProcessingException{
		ObjectMapper om = new ObjectMapper();
		List<User> users = new ArrayList<>();
		users.addAll(List.of(
				new User(1,"Abdul Rahman","arrahman@gmail.com"),
				new User(2,"Lionel Messi","messi10@gmail.com")
				));
		//String usersAsString = om.writeValueAsString(users);
		//return ResponseEntity.ok(usersAsString);
		
		return ResponseEntity.ok(users);
	}

}
