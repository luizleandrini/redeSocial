package com.lg.leandrini.redeSocial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@GetMapping
	String home() {
		return "Hello World!";
	}
}
