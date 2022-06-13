package br.com.joaopaulo.conversor.api;

public enum TipoMoeda {
	REAL("BRL"),
	DOLLAR_AMERICANO("USD"),
	LIBRAS_ESTERLINAS("GBP"),
	PESO_ARGENTINO("ARS"),
	PESO_CHILENO("ARS"),
	EURO("EUR");
	
	private String tipo;
	
	TipoMoeda(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}
