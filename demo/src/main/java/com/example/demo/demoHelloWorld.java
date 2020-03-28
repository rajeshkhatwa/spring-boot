package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoHelloWorld {

	@RequestMapping("/hellowworld")
	public String helloWorld() {
		return "Hello World";
	}
}
