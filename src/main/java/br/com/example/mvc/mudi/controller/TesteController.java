package br.com.example.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Mundo");
		return "hello";
	}
	
}
