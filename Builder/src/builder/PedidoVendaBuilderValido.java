package builder;

import model.PedidoVenda;

public class PedidoVendaBuilderValido {

	private PedidoVenda instancia;
	
	public PedidoVendaBuilderValido(PedidoVenda instancia) {
	    this.instancia = instancia;
    }

	public PedidoVenda construir() {
		return this.instancia;
	}
	
}
