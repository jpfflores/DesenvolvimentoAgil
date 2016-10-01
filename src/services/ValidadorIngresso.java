package services;

import model.Ingresso;
import model.ValidacaoIngressoException;
import enums.CategoriaIngresso;


public class ValidadorIngresso {
	
	public void ValidarIngresso(Ingresso ingresso) throws Exception{
		testaIngressoVIP(ingresso);
		testaIngressoBackstage(ingresso);
		testaIngressoPlateiaVip(ingresso);
		testaIngressoPlateia(ingresso);
	}

	public void testaIngressoVIP(Ingresso ingresso) {
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingressoVIP = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.VIP);
		if(ingressoVIP.getValor() != 1000)
			throw new ValidacaoIngressoException("O valor deve ser 1000,00");
	}
	
	public void testaIngressoBackstage(Ingresso ingresso) {
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingressoBackstage = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.BACKSTAGE);
		if(ingressoBackstage.getValor() != 800)
			throw new ValidacaoIngressoException("O valor deve ser 800,00");
	}
	
	public void testaIngressoPlateiaVip(Ingresso ingresso) {
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingressoPlateiaVip = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.PLATEIA_VIP);
		if(ingressoPlateiaVip.getValor() != 500)
			throw new ValidacaoIngressoException("O valor deve ser 500,00");
	}
	
	public void testaIngressoPlateia(Ingresso ingresso) {
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingressoPlateia = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.PLATEIA);
		if(ingressoPlateia.getValor() != 300)
			throw new ValidacaoIngressoException("O valor deve ser 300,00");
	}
	
}
