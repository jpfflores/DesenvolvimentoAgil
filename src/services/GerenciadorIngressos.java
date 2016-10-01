package services;

import model.Ingresso;
import model.ValidacaoEventoException;
import enums.CategoriaIngresso;

public class GerenciadorIngressos {
	
	public  Ingresso gerarIngresso(CategoriaIngresso categoriaIngresso) {
	
		switch(categoriaIngresso){
	
		case VIP:
			return new Ingresso(CategoriaIngresso.VIP, 1000);
		case BACKSTAGE:
			return new Ingresso(CategoriaIngresso.BACKSTAGE, 800);
		case PLATEIA_VIP:
			return new Ingresso(CategoriaIngresso.PLATEIA_VIP, 500);
		case PLATEIA:
			return new Ingresso(CategoriaIngresso.PLATEIA, 300);
		}
		
		throw new ValidacaoEventoException("Categoria de ingresso não existe.");
	}
	
	

	
}
