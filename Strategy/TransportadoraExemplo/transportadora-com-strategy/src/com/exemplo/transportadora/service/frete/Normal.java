package com.exemplo.transportadora.service.frete;

import com.exemplo.transportadora.service.Frete;

public class Normal implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.25 + 10;
	}
	
}
