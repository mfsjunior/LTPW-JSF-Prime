package br.com.curso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Anotação responsável por informar ao Spring MVC que esta é uma classe (bean) do tipo controller;
@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "redirect:/usuario/todos";
	}
}

//da linha 10 a linha 14 o objetivo é maperar o acesso, via URL 

//Outro objetivo é definir o verbo HTTP (POST, GET, ...) referente à solicitação;