package com.habilidadesmentalidades.habilidadesmentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidadesmentalidades")
public class habilidadesmentalidadesController {

		@GetMapping
		public String habilidadesmentalidades(){
			return"Atenção aos detalhes,  persistencia";
		}
}
