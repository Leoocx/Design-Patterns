package com.abs.factory.gestorderisco;

import java.math.BigDecimal;

public class FControl implements GestorDeRisco {
	@Override
	public void avaliarRisco(String cartao, BigDecimal valor) throws AlertaDeRiscoException {
		if (cartao.startsWith("7777")) {
			throw new AlertaDeRiscoException("Cartão suspeito.");
		}
    }

}
