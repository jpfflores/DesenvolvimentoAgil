package services;

import Model.Ingresso;
import Enums.CategoriaIngresso;

public class GerenciadorIngressos {
	
	public Ingresso getVIP() {
		Ingresso ingresso = new Ingresso();			
		ingresso.setCategoria(CategoriaIngresso.VIP);
		ingresso.setValor(1000.00);	
		
		return ingresso;
	}

	public Ingresso getBackStage() {
		Ingresso ingresso = new Ingresso();			
		ingresso.setCategoria(CategoriaIngresso.BACKSTAGE);
		ingresso.setValor(800.00);	
		
		return ingresso;
	}

	public Ingresso getPlateiaVip() {
		Ingresso ingresso = new Ingresso();			
		ingresso.setCategoria(CategoriaIngresso.PLATEIA_VIP);
		ingresso.setValor(500.00);	
		
		return ingresso;
	}
	public Ingresso getBackPlateia() {
		Ingresso ingresso = new Ingresso();			
		ingresso.setCategoria(CategoriaIngresso.PLATEIA);
		ingresso.setValor(300.00);	
		
		return ingresso;
	}
}
