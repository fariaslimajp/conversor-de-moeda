package br.com.joaopaulo.conversor.calculadora;
/**
 * 
 * Enum responsável por armazenar as siglas das moedas utilizadas no conversor.
 * @author João Paulo
 *
 */
public enum TipoMoedaEnum {
	REAL("BRL"),
	DOLLAR_AMERICANO("USD"),
	LIBRAS_ESTERLINAS("GBP"),
	PESO_ARGENTINO("ARS"),
	PESO_CHILENO("ARS"),
	EURO("EUR");
	
	private String tipo;
	
	TipoMoedaEnum(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}
