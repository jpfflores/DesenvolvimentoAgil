package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Eventos.*;

import java.util.Date;

public class ValidadorEventoTeste {


	@Test
	public void testaValidaNomePreenchidoVazio(){
		Evento evento = new Evento();
		ValidadorEvento valEvento = new ValidadorEvento();
		valEvento.testaNomePreenchido(evento);

	}
	
	@Test
	public void testaValidaNomePreenchidoCorreto(){
		Evento evento = new Evento();
		evento.setNome("Alberto");
		ValidadorEvento valEvento = new ValidadorEvento();
		if (!valEvento.testaNomePreenchido(evento) )
			fail("Está preenchido e não validou");

	}

	@Test
	public void testaValidaDataPreenchidaVazio(){
		Evento evento = new Evento();
		ValidadorEvento valEvento = new ValidadorEvento();
		valEvento.testaDataPreenchida(evento);

	}
	
	@Test
	public void testaValidaDataPreenchidaCorreta(){
		Evento evento = new Evento();
		Date dataAtual = new Date();
		evento.setData(dataAtual);
		ValidadorEvento valEvento = new ValidadorEvento();
		if (!valEvento.testaDataPreenchida(evento) )
			fail("Está preenchido e não validou");

	}

	
}
