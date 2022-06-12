package br.com.joaopaulo.conversor.calculadora;

import br.com.joaopaulo.conversor.api.ConversorDeMoedasApi;
import br.com.joaopaulo.conversor.api.TipoMoeda;

public class Conversor {

	public String converterMoeda(String tipoDeConversao, double valor) {
		
		ConversorDeMoedasApi conversor = new ConversorDeMoedasApi();
		double valorConvertido;
		
		if (tipoDeConversao == "De Reais a Dólar") {
			valorConvertido = conversor.converterMoeda(TipoMoeda.REAL, TipoMoeda.DOLLAR_AMERICANO, valor);
			return "$ " + valorConvertido;
		}
		
		return null;
	}

}
