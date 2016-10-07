package services;

import model.EstrategiaDesconto;


public class CalculadoraIngresso {
	
	public double calcularValor(EstrategiaDesconto estrategiaDesconto){
		return estrategiaDesconto.calcular();
	
	}
}
	