package model;

import enums.CategoriaIngresso;
public class Ingresso {

	private double valor;
	private CategoriaIngresso tipo;

	public Ingresso(CategoriaIngresso tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
		
	}
	
	public CategoriaIngresso getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

}
