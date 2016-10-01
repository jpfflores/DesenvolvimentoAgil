package services;

import java.util.Date;
import java.util.List;

import enums.CategoriaIngresso;
import model.Evento;
import model.Ingresso;
import model.ValidacaoEventoException;

public class ValidadorEvento {

	public void ValidarEvento(Evento evento) throws Exception {
		testaNomePreenchido(evento);
		testaDataPreenchida(evento);
		testaTamanhoNome(evento);
		testaDataMaiorQueAtual(evento);
		testaIngressoDuplicado(evento);
	}

	public void testaNomePreenchido(Evento evento) {
		if (evento.getNome() == null)
			throw new ValidacaoEventoException("O nome deve ser preenchido");
	}

	public void testaDataPreenchida(Evento evento) {
		if (evento.getData() == null)
			throw new ValidacaoEventoException("A data deve ser preenchido");

	}

	public void testaTamanhoNome(Evento evento) {

		if (evento.getNome().length() > 150)
			throw new ValidacaoEventoException("O nome permite no maximo 150 caracteres");
	}

	public void testaDataMaiorQueAtual(Evento evento) {
		Date dataAtual = new Date();
		if (dataAtual.compareTo(evento.getData()) > 0)
			throw new ValidacaoEventoException("A data do evento deve ser maior ou igual a data de hoje");

	}

	public void testaIngressoDuplicado(Evento evento) {

	}

}
