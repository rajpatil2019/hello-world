package com.example.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class HelloWorldRestController {
	
	@GetMapping(value="/hello")
	public ResponseEntity<String> helloWorld(){
		return ResponseEntity.ok().body("Hello World ...");

	}
}
