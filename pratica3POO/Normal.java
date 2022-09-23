package br.com.newtonpaiva.pratica3POO;


public class Normal extends Ingresso {



	public Normal(double valorIngresso) {
		super(valorIngresso);
	}
	
	public String valorIngresso ()
	{
        return "Valor do Ingresso: " + getValorIngresso();
	}
        
	

}  