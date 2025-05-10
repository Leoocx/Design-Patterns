package com.abs.factory.pagamento.cielo;

import com.abs.factory.gestorderisco.ClearSale;
import com.abs.factory.gestorderisco.GestorDeRisco;
import com.abs.factory.operadora.Operadora;
import com.abs.factory.operadora.Redecard;
import com.abs.factory.pagamento.ModuloPagamentoFactory;

public class PayPalModuloPagamentoFactory implements ModuloPagamentoFactory {


    @Override
    public Operadora criarOperadora() {
        return new Redecard();
    }

    @Override
    public GestorDeRisco criarGestorDeRisco() {
        return new ClearSale();
    }
}
