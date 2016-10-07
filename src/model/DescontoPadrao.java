package model;

public class DescontoPadrao implements EstrategiaDesconto {
	Desconto desconto;
	Ingresso ingresso;
	
	public void  EstrategiaDesconto(Desconto desconto, Ingresso ingresso){
		this.desconto = desconto;
		this.ingresso = ingresso;
	}
	
	public double calcular() {
		// TODO Auto-generated method stub
		return this.ingresso.getValor() - ( ( this.ingresso.getValor() * this.desconto.getValor()) / 100 ); 
		
	}

}
