package br.com.joaopaulo.conversor.calculadora;

public class ConversorReais {
	
	public String ParaDolar(double valor) {
		double valorConvertido;
		valorConvertido = valor * 0.2;
		return "R$ " + valorConvertido;
	}
}
