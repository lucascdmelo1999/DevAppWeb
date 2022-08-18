package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@PostMapping("/greeting")
	public String greeting(@RequestParam(value = "nome") String nome, @RequestParam(value = "pwd") String pass) {
		return "test" + nome + "senha " + pass;
	}
	
}
