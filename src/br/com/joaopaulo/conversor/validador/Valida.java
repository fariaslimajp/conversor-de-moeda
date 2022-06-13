package br.com.joaopaulo.conversor.validador;
/**
 * 
 * @author João Paulo Farias Lima
 *
 */
public class Valida {
	
	private double valorConvertido;
	
	/**
	 * Método recebe um valor String e verifica se é um Double, utilizando do {@link Double#parseDouble(String)} e, caso seja uma double, armazena o valor convertido para que possa ser utilizado.
	 * 
	 * @param valor
	 * @return true, se o valor for um valor numérico fracionado e false se não for
	 */
	public boolean validaNumeroDigitado (String valor) {
		
		try {
			valorConvertido = Double.parseDouble(valor);
			return true;
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 
	 * @return retorna o valor convertido durante a validação do valor digitado através do método validaNumeroDigitado
	 */
	public double getValorConvertido() {
		return valorConvertido;
	}
	
}
