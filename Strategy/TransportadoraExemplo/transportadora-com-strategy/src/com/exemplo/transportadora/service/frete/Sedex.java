package com.exemplo.transportadora.service.frete;

import com.exemplo.transportadora.service.Frete;

public class Sedex implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.45 + 12;
	}
	
}
