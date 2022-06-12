package br.com.joaopaulo.conversor.view;

import javax.swing.JOptionPane;

import br.com.joaopaulo.conversor.calculadora.VerificaDados;

public class ConversorFrame {

	public void MenuPrincipal() {
		Object[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };

		Object valorSelecionado = JOptionPane.showInputDialog(null, "Escolha Uma opção", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

		System.out.println(valorSelecionado);
		if (valorSelecionado == opcoes[0]) {
			inputValor();
		}
	}

	private void inputValor() {
		String valor = JOptionPane.showInputDialog("Insira um valor.");
		VerificaDados verificador = new VerificaDados();
		if (valor == null) {
			MenuPrincipal();
			return;
		}
		if (verificador.isNaN(valor)) {
			double valorConvertido = Double.parseDouble(valor);
			selecioneMoeda(valorConvertido);

		} else {
			JOptionPane.showMessageDialog(null, "Valor inválido. Utilize '.' para definir uma casa decimal");
			inputValor();
		}
	}

	private void selecioneMoeda(double valor) {
		Object[] opcoes = { "De Reais a Dólar", // 0
				"De Reais a Euro", // 1
				"De Reais a Libras Esterlinas", // 2
				"De Reais a Peso argentino", // 3
				"De Reais a Peso Chileno", // 4
				"De Dólar a Reais", // 5
				"De Euro a Reais", // 6
				"De Libras Esterlinas a Reais", // 7
				"De Peso argentino a  Reais", // 8
				"De Peso Chileno a Reais" // 9
		};

		Object valorSelecionado = JOptionPane.showInputDialog(null,
				"Escolha a moeda para qual você deseja converter seu dinheiro", "Moedas",
				JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

		desejaContinuar();

	}

	public void RetornaValor(String valor) {
		JOptionPane.showInputDialog("O valor da conversão é de: " + valor + ".");
	}

	public void desejaContinuar() {
		// Se sim = 0; se não = 1; se cacelar = 2;
		int retorno = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma Opção",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (retorno == 1) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado.");
			return;
		}

		if (retorno == 2) {
			JOptionPane.showMessageDialog(null, "Programa Concluido!");
			return;
		}

		MenuPrincipal();
	}
}
