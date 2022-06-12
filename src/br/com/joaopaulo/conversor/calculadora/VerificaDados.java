package br.com.joaopaulo.conversor.calculadora;

public class VerificaDados {
	
	public boolean isNaN (String valor) {
		
		try {
			Double.parseDouble(valor);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
}
