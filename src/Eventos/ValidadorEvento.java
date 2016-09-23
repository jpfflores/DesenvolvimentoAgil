package Eventos;

import java.util.Date;


public class ValidadorEvento {

	public boolean testaNomePreenchido(Evento evento){
		if(evento.getNome() == null)
			return false;
		return true;
	}
	
	public boolean testaDataPreenchida(Evento evento){
		if(evento.getData() == null)
			return false;
		
		return true;
	}
	
	public boolean testaTamanhoNome(Evento evento)
	{
		
		if (evento.getNome().length() > 150)
			return false;
		return true;
	}

	public boolean testaDataMaiorQueAtual(Evento evento)
	{
		Date dataAtual = new Date();
		if( dataAtual.compareTo(evento.getData()) > 0)
			return false;
		
		return true;
		
	}
	
}
