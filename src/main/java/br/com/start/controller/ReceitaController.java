package br.com.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/receitas")
public class ReceitaController {
	
	@GetMapping
	public String homeReceita() {
		return "pages/receita/receita";
	}

}
