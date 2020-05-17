package br.com.alura.forum.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<Topico> lista(){
		Topico topico = new Topico("Duvid", "Duvida com Spirng", new Curso("Spring", "Programacao"));
	
		Arrays.asList(topico, topico, topico);
	}
}
	