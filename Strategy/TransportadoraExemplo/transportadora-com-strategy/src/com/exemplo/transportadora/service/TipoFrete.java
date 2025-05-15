package com.exemplo.transportadora.service;

import com.exemplo.transportadora.service.frete.Normal;
import com.exemplo.transportadora.service.frete.Sedex;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	public abstract Frete obterFrete();
	
}
