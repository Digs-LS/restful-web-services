package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Expose the REST API
@RestController
public class HelloWorldController {

	// Simply return a "Hello World" to request '/hello-world'
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
