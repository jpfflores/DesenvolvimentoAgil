package Testes;

import org.junit.Assert;
import org.junit.Test;

import enums.Associado;

import model.Desconto;
import services.GeradorDesconto;

public class DescontoTest {

	@Test
	public void testaValorDescontoGOLD75(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.GOLD);
		Assert.assertEquals(desconto.getValor(),(double) 75, 2);
	}
	

	@Test
	public void testaValorDescontoGOLDNot75(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.GOLD);
		Assert.assertNotEquals(desconto.getValor(),(double) 80, 2);

	}

	@Test
	public void testaValorDescontoSILVER60(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.SILVER);
		Assert.assertEquals(desconto.getValor(),(double) 60, 2);
	}
	

	@Test
	public void testaValorDescontoSILVERNot60(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.SILVER);
		Assert.assertNotEquals(desconto.getValor(),(double) 500, 2);

	}

	@Test
	public void testaValorDescontoESTUDANTE50(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.ESTUDANTE);
		Assert.assertEquals(desconto.getValor(),(double) 50, 2);
	}
	

	@Test
	public void testaValorDescontoESTUDANTENot50(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.ESTUDANTE);
		Assert.assertNotEquals(desconto.getValor(),(double) 300, 2);

	}

	@Test
	public void testaValorDescontoIDOSO50(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.IDOSO);
		Assert.assertEquals(desconto.getValor(),(double) 50, 2);
	}
	

	@Test
	public void testaValorDescontoIDOSONot50(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.IDOSO);
		Assert.assertNotEquals(desconto.getValor(),(double) 1000, 2);

	}

	@Test
	public void testaValorDescontoGERALZero(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.GERAL);
		Assert.assertEquals(desconto.getValor(),(double) 0, 2);
	}
	

	@Test
	public void testaValorDescontoGERALNotZero(){
		GeradorDesconto geradorDescontos = new GeradorDesconto();
		Desconto desconto = geradorDescontos.gerarDesconto(Associado.GERAL);
		Assert.assertNotEquals(desconto.getValor(),(double) 1000, 2);

	}


}
