package model;

import enums.Associado;

public class Desconto {

	private double valor;
	private Associado tipo;

	public Desconto(Associado tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public Associado getTipo() {
		return tipo;
	}
	
}
