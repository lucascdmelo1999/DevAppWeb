package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("/")
	public String forms (Model model) {
		return "aulaum";
	}
	
//	@PostMapping("/greeting")
//	public String greeting(@RequestParam(value = "nome") String nome, @RequestParam(value = "pwd") String pass) {
//		return "test" + nome + "senha " + pass;
//	}
	
}
