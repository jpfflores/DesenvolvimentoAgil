package services;

import model.EstrategiaDesconto;
import model.Ingresso;


public class CalculadoraIngresso {
	
	public double calcularValor(EstrategiaDesconto estrategiaDesconto){
		return estrategiaDesconto.calcular();
	
	}
}
