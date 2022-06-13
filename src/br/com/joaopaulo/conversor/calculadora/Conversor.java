package br.com.joaopaulo.conversor.calculadora;

import br.com.joaopaulo.conversor.api.ConversorDeMoedasApi;
import br.com.joaopaulo.conversor.api.TipoMoeda;

public class Conversor {

	public String converterMoeda(String tipoDeConversao, double valor) {

		ConversorDeMoedasApi conversor = new ConversorDeMoedasApi();
		double valorConvertido;

		switch (tipoDeConversao) {
		case "De Reais a Dólar": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.REAL, TipoMoeda.DOLLAR_AMERICANO, valor);
			return "$ " + valorConvertido;
		}

		case "De Reais a Libras Esterlinas": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.REAL, TipoMoeda.LIBRAS_ESTERLINAS, valor);
			return "£ " + valorConvertido;
		}
		
		case "De Reais a Peso argentino": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.REAL, TipoMoeda.PESO_ARGENTINO, valor);
			return "$ " + valorConvertido;
		}
		
		case "De Reais a Peso Chileno": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.REAL, TipoMoeda.PESO_CHILENO, valor);
			return "$ " + valorConvertido;
		}
		case "De Reais a Euro": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.REAL, TipoMoeda.EURO, valor);
			return "€ " + valorConvertido;
		}
		case "De Dólar a Reais": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.DOLLAR_AMERICANO, TipoMoeda.REAL, valor);
			return "R$ " + valorConvertido;
		}
		
		case "De Euro a Reais": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.EURO, TipoMoeda.REAL, valor);
			return "R$ " + valorConvertido;
		}
		case "De Libras Esterlinas a Reais": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.LIBRAS_ESTERLINAS, TipoMoeda.REAL, valor);
			return "R$ " + valorConvertido;
		}
		case "De Peso argentino a  Reais": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.PESO_ARGENTINO, TipoMoeda.REAL, valor);
			return "R$ " + valorConvertido;
		}
		case "De Peso Chileno a Reais": {
			valorConvertido = conversor.converterMoeda(TipoMoeda.PESO_CHILENO, TipoMoeda.REAL, valor);
			return "R$ " + valorConvertido;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoDeConversao);
		}
	}

}
