package com.example.lembretes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lembretes.Repository.LembreteRepository;

@Controller
public class LembreteController {
	
	@Autowired
	private LembreteRepository repository;
	
	@RequestMapping("/")
	public String cadastro() {
		return "View/cadastroLembrete";
	}
	

}
