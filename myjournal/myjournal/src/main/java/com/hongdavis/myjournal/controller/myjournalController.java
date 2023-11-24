package com.hongdavis.myjournal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class myjournalController {
	
	@GetMapping("/hello")
	public String hello() {
	return "Hello, world!";	}

}
