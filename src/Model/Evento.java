package model;
import java.util.Date;
import java.util.List;

public class Evento {

	private String nome;
	private Date data;
	private List<Ingresso> ingressos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Ingresso> getIngressos(){
		return ingressos;
	}
}
