package Model;
import Enums.CategoriaIngresso;

public class Ingresso {

	private CategoriaIngresso categoria;
	private Double valor;

	public CategoriaIngresso getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaIngresso categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
