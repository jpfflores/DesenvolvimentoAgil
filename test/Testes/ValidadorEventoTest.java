package Testes;


import static org.junit.Assert.fail;

import java.util.Date;

import model.Evento;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

import services.ValidadorEvento;

public class ValidadorEventoTest {

	private static final LocalDate TODAY = LocalDate.now();
	private static final String DATE_FOR_CREATE_MESSAGE = "A data do evento deve ser igual ou maior que a de hoje";
	private static final String DATE_MUST_BE_FILLED = "A data deve ser preenchido";
	private static final String NAME_MUST_BE_FILLED = "O nome deve ser preenchido";
	private static final int MAX_NAME_CHARACTERS = 150;
	private static final String MAX_NAME_CHARACTERS_MESSAGE = "O nome permite no maximo 150 caracteres";
	/*
	@Test
	
	public void testaValidadorEventos(){
		
	}
	*/
	@Test
	public void testaValidaNomePreenchidoVazio(){
		Evento evento = new Evento();
		ValidadorEvento valEvento = new ValidadorEvento();
		try {
			valEvento.testaNomePreenchido(evento);
			fail("Deveria ter gerado excecao");
		} catch (Exception e) {
			Assert.assertEquals(NAME_MUST_BE_FILLED,e.getMessage());
		}
	
	}

	@Test
	public void testaValidaNomePreenchidoMenos150(){
		Evento evento = new Evento();
		evento.setNome(RandomStringUtils.random(10));
		ValidadorEvento valEvento = new ValidadorEvento();
		valEvento.testaNomePreenchido(evento);

	}
	
	@Test
	public void testaValidaNomePreenchido150(){
		Evento evento = new Evento();
		evento.setNome(RandomStringUtils.random(150));
		ValidadorEvento valEvento = new ValidadorEvento();
		valEvento.testaNomePreenchido(evento);

	}

	@Test
	public void testaValidaNomePreenchidoMais150(){
		Evento evento = new Evento();
		evento.setNome(RandomStringUtils.random(180));
		ValidadorEvento valEvento = new ValidadorEvento();
		try {
			valEvento.testaNomePreenchido(evento);
		}
		catch (Exception e) {
			fail(e.getMessage());
			
		}


	}

	@Test
	public void testaValidaDataPreenchidaVazio(){
		Evento evento = new Evento();
		ValidadorEvento valEvento = new ValidadorEvento();
		try {
			valEvento.testaDataPreenchida(evento);
			fail("Deveria ter gerado excecao");
		} catch (Exception e) {
			Assert.assertEquals(DATE_MUST_BE_FILLED,e.getMessage());
		}
	}
	
	@Test
	public void testaValidaDataPreenchidaAtual(){
		Evento evento = new Evento();
		evento.setData(TODAY.toDate());
		ValidadorEvento valEvento = new ValidadorEvento();
		
		valEvento.testaDataPreenchida(evento);

		

	}

	@Test
	public void testaValidaDataPreenchidaMaiorQueAtual(){
		Evento evento = new Evento();
		evento.setData(TODAY.plusDays(5).toDate());
		ValidadorEvento valEvento = new ValidadorEvento();
		
		valEvento.testaDataPreenchida(evento);

		

	}
	
}
