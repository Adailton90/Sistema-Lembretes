package com.example.lembretes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.lembretes.Model.LembreteEntity;
import com.example.lembretes.Repository.LembreteRepository;

@Controller
public class LembreteController {
	
	@Autowired
	private LembreteRepository repository;
	
	@RequestMapping("/")
	public String cadastro() {
		return "View/cadastroLembrete";
	}
	
	
	@GetMapping("/cadastrarLembrete")
	public ModelAndView cadastrarLembrete() {
		ModelAndView retorno = new ModelAndView("/View/cadastroLembrete");
		retorno.addObject("lembrete", new LembreteEntity());
		return retorno;
	}
	
	@PostMapping
	public ModelAndView cadastrarLembrete(LembreteEntity lembrete) {
		repository.save(lembrete);
		return new ModelAndView("redirect:/cadastrarLembrete");
	}
	
	@GetMapping("/listarLembretes")
	public ModelAndView listarLembretes() {
		ModelAndView retorno = new ModelAndView("View/listaLembrete");
		retorno.addObject("listaLembrete", repository.findAll());//dando nome ao objeto e metodo de trazer todos 
		return retorno;
	}
	
	
	
}
