package services;

import model.Ingresso;
import model.ValidacaoIngressoException;
import enums.CategoriaIngresso;


public class ValidadorIngresso {
	
	public void ValidarIngresso(Ingresso ingresso) throws Exception{
		testaIngresso(ingresso);
	}

	public void testaIngresso(Ingresso ingresso) {
		switch(ingresso.getTipo()){ 
		
		case VIP:
			if(ingresso.getValor() != 1000)
				throw new ValidacaoIngressoException("O valor do ingresso VIP deve ser 1000,00");

		case BACKSTAGE:
			if(ingresso.getValor() != 800)
				throw new ValidacaoIngressoException("O valor do ingresso BACKSTAGE deve ser 800,00");

		case PLATEIA_VIP:
			if(ingresso.getValor() != 500)
				throw new ValidacaoIngressoException("O valor do ingresso VIP deve ser 500,00");

		case PLATEIA:
			if(ingresso.getValor() != 300)
				throw new ValidacaoIngressoException("O valor do ingresso VIP deve ser 300,00");
		default:
			break;
		}
	}
	
	
	
}
