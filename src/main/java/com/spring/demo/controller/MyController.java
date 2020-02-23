package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String helloWord() {
		
		System.out.println("Entrou no método helloWord.");
		return "Hello word!";
	}
}
