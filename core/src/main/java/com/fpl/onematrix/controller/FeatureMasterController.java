package com.fpl.onematrix.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller(value = "api", port = "9090")
public class FeatureMasterController {

	@Get(value = "/greet")
	public String greet() {
		log.info("HEllo");
		System.out.println("HEllo");

		return "Hello";
	}

}
