package com.abs.factory.pagamento;

import com.abs.factory.gestorderisco.GestorDeRisco;
import com.abs.factory.operadora.Operadora;

public interface ModuloPagamentoFactory {

    public Operadora criarOperadora();
    public GestorDeRisco criarGestorDeRisco();

}
