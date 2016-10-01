package model;

import enums.CategoriaIngresso;
public class Ingresso {

	private double m_Valor;
	private CategoriaIngresso m_Tipo;

	public Ingresso(CategoriaIngresso tipo, double valor) {
		m_Tipo = tipo;
		m_Valor = valor;
		
	}
	
	public CategoriaIngresso getTipo() {
		return m_Tipo;
	}

	public double getValor() {
		return m_Valor;
	}

}
