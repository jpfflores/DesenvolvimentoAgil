package services;

import model.Desconto;
import model.ValidacaoEventoException;
import enums.Associado;

public class GeradorDesconto {

	public Desconto gerarDesconto(Associado consumidor) {
		
		switch (consumidor) {

		case GOLD:
			return new Desconto(Associado.GOLD, 75);
		case SILVER:
			return new Desconto(Associado.SILVER, 60);
		case ESTUDANTE:
			return new Desconto(Associado.ESTUDANTE, 50);
		case IDOSO:
			return new Desconto(Associado.IDOSO, 50);
		case GERAL:
			return new Desconto(Associado.GERAL, 0);
		}

		throw new ValidacaoEventoException("Categoria de ingresso nao existe.");
	}

	
}
