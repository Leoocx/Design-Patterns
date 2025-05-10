package com.abs.factory.pagamento.pagseguro;

import com.abs.factory.gestorderisco.FControl;
import com.abs.factory.gestorderisco.GestorDeRisco;
import com.abs.factory.operadora.Cielo;
import com.abs.factory.operadora.Operadora;
import com.abs.factory.pagamento.ModuloPagamentoFactory;

public class PagSeguroModuloPagamentoFactory implements ModuloPagamentoFactory {


    @Override
    public Operadora criarOperadora() {
        return new Cielo();
    }

    @Override
    public GestorDeRisco criarGestorDeRisco() {
        return new FControl();
    }
}
