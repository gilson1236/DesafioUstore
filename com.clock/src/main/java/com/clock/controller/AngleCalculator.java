package com.clock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clock.entity.Clock;

@RestController
@RequestMapping("/rest/clock")
public class AngleCalculator {

	private Clock lista[][] = new Clock[13][60];
	
	@GetMapping(value = "/{hora}/{minuto}", produces = {"application/json"})
	public Clock getClockJson(@PathVariable int hora, @PathVariable int minuto) {
		
		Clock relogio = new Clock();
		
		if(this.lista[hora][minuto] == null) {
			relogio.setHora(hora);
			relogio.setMinuto(minuto);
			this.lista[hora][minuto] = relogio;
		} else {
			System.out.println("Cache");
			relogio = this.lista[hora][minuto];
		}
		
		return this.lista[hora][minuto];
	}
}
