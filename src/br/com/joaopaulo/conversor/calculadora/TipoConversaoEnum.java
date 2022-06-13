package br.com.joaopaulo.conversor.calculadora;

/**
 * Enum responsavel por armazenar o tipo de conversão a ser realizada.
 * 
 * @author João Paulo Farias Lima
 *
 */

public enum TipoConversaoEnum {
	REAIS_A_DOLAR("De Reais a Dólar"),
	REAIS_A_EURO("De Reais a Euro"),
	REAIS_A_LIVRAS_ESTERLINAS("De Reais a Libras Esterlinas"),
	REAIS_A_PESO_ARGENTINO("De Reais a Peso argentino"),
	REAIS_A_PESO_CHILENO("De Reais a Peso Chileno"),
	
	DOLAR_A_REAIS("De Dólar a Reais"),
	EURO_A_REAIS("De Euro a Reais"),
	LIVRAS_ESTERLINAS_A_REAIS("De Libras Esterlinas a Reais"),
	PESO_ARGENTINO_A_REAIS("De Peso argentino a  Reais"),
	PESO_CHILENO_A_REAIS("De Peso Chileno a Reais");
	
	private String tipo;
	
	private TipoConversaoEnum(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}