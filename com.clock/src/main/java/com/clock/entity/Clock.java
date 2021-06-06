package com.clock.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Clock {
 
	private static final int ANGULO_POR_HORA = 30;
	private static final int ANGULO_POR_MINUTO = 6;
	
	private int hora;
	private int minuto;
	private int angulo;
	
}
