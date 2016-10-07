package services;

import model.Desconto;
import model.ValidacaoIngressoException;

public class ValidadorDesconto {

	public void ValidarDesconto(Desconto desconto) throws Exception{
			testaDesconto(desconto);
		}

		public void testaDesconto(Desconto desconto) {
			switch(desconto.getTipo()){ 
			
			case GOLD:
				if(desconto.getValor() != 75)
					throw new ValidacaoIngressoException("O valor do desconto deve ser 75%");

			case SILVER:
				if(desconto.getValor() != 60)
					throw new ValidacaoIngressoException("O valor do desconto deve ser 60%");

			case ESTUDANTE:
				if(desconto.getValor() != 50)
					throw new ValidacaoIngressoException("O valor do desconto deve ser 50%");

			case IDOSO:
				if(desconto.getValor() != 50)
					throw new ValidacaoIngressoException("O valor do desconto deve ser 50%");
			case GERAL:
				if(desconto.getValor() != 0)
					throw new ValidacaoIngressoException("O valor do desconto deve ser 0%");

			default:
				break;
			}
		}
		
}
