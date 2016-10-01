package Testes;

import static org.junit.Assert.fail;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import model.Ingresso;



import services.GerenciadorIngressos;
import enums.CategoriaIngresso;

public class ValidadorIngressoTest {


	@SuppressWarnings("deprecation")
	@Test
	public void testaValorIngressoVip1000(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.VIP);
		Assert.assertEquals(ingresso.getValor(),(double) 1000, 2);
	}
	

	@Test
	public void testaValorIngressoVipNot1000(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.VIP);
		Assert.assertNotEquals(ingresso.getValor(),(double) 800, 2);

	}

	@Test
	public void testaValorIngressoBackstage800(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.BACKSTAGE);
		Assert.assertEquals(ingresso.getValor(),(double) 800, 2);
	}
	

	@Test
	public void testaValorIngressoBackstageNot800(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.BACKSTAGE);
		Assert.assertNotEquals(ingresso.getValor(),(double) 500, 2);

	}

	@Test
	public void testaValorIngressoPlateiaVip500(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.PLATEIA_VIP);
		Assert.assertEquals(ingresso.getValor(),(double) 500, 2);
	}
	

	@Test
	public void testaValorIngressoPlateiaVipNot500(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.PLATEIA_VIP);
		Assert.assertNotEquals(ingresso.getValor(),(double) 300, 2);

	}

	@Test
	public void testaValorIngressoPlateia300(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.PLATEIA);
		Assert.assertEquals(ingresso.getValor(),(double) 300, 2);
	}
	

	@Test
	public void testaValorIngressoPlateiaNot300(){
		GerenciadorIngressos gerenciadorIngressos = new GerenciadorIngressos();
		Ingresso ingresso = gerenciadorIngressos.gerarIngresso(CategoriaIngresso.PLATEIA);
		Assert.assertNotEquals(ingresso.getValor(),(double) 1000, 2);

	}



}
