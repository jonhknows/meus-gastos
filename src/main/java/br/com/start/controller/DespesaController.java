package br.com.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.start.model.Operacao;

@Controller
@RequestMapping(value = "/despesas")
public class DespesaController {
	
	@GetMapping
	public ModelAndView homeDespesa() {
		ModelAndView mv = new ModelAndView("pages/despesa/despesa");
		mv.addObject("extrato", new Operacao());
		return mv;
	}

}
