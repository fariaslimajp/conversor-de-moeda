package br.com.joaopaulo.conversor.view;

import javax.swing.JOptionPane;

import br.com.joaopaulo.conversor.calculadora.Conversor;
import br.com.joaopaulo.conversor.calculadora.TipoConversaoEnum;
import br.com.joaopaulo.conversor.calculadora.TipoConversaoTemperatura;
import br.com.joaopaulo.conversor.validador.Valida;

/**
 * 
 * @author João Paulo Farias Lima
 * @version 1.0
 *
 */
public class ConversorView {

	private Object[] opcoes = { "Conversor de Moedas", "Conversor de Temperatura" };

	/**
	 * Chama a janela principal ({@link JOptionPane}) do programa.
	 */
	public void MenuPrincipal() {

		// JOPtionPane selecionando uma opção de conversão

		Object valorSelecionado = JOptionPane.showInputDialog(null, "Escolha Uma opção", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		if (valorSelecionado == null) {
			System.exit(0);
		}
		capturadorDeValores(valorSelecionado);
	}

	/**
	 * 
	 * @param tipoDeConversao parâmetro que representa o tipo de conversão escolhida
	 *                        no menú principal.
	 */
	private void capturadorDeValores(Object tipoDeConversao) {

		String valor = JOptionPane.showInputDialog("Insira o valor que deseja converter.");

		// Verifica se o usuário clicou em cancelar.

		if (valor == null) {
			MenuPrincipal();
			return;
		}

		Valida validador = new Valida();
		if (validador.validaNumeroDigitado(valor)) {
			seletorDeConversao(validador.getValorConvertido(), tipoDeConversao);

		} else {
			JOptionPane.showMessageDialog(null, "Valor inválido. Utilize '.' para definir uma casa decimal");
			capturadorDeValores(tipoDeConversao);
		}

	}

	/**
	 * Chama o metodo de acordo com o que deseja converter.
	 * 
	 * @param valorConvertido
	 * @param conversaoDesejada
	 */
	private void seletorDeConversao(double valorConvertido, Object conversaoDesejada) {
		if (conversaoDesejada == opcoes[0]) {
			seletorDeMoeda(valorConvertido);
		}
		if (conversaoDesejada == opcoes[1]) {
			seletorDeTemperatura(valorConvertido);
		}
	}

	/**
	 * Função criada para selecionar o tipo de conversão de Moeda
	 * 
	 * @param valor valor inicial da conversão.
	 */
	private void seletorDeMoeda(double valor) {

		TipoConversaoEnum[] opcoes = TipoConversaoEnum.values();

		TipoConversaoEnum conversaoDeMoeda = (TipoConversaoEnum) JOptionPane.showInputDialog(null,
				"Escolha o método de conversão", "Moedas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

		Conversor conversor = new Conversor();
		String valorConvertido = conversor.converterMoeda(conversaoDeMoeda, valor);
		RetornaValor(valorConvertido);
		desejaContinuar();

	}

	/**
	 * Função criada para selecionar o tipo de conversão de Temperatura.
	 * 
	 * @param valor valor de temperatura a ser convertido.
	 */
	private void seletorDeTemperatura(double valor) {

		TipoConversaoTemperatura[] opcoes = TipoConversaoTemperatura.values();

		TipoConversaoTemperatura conversaoDeTemperatura = (TipoConversaoTemperatura) JOptionPane.showInputDialog(null,
				"Conversão de Temperatura desejado", "Temperatura", JOptionPane.INFORMATION_MESSAGE, null, opcoes,
				opcoes[0]);

		Conversor conversor = new Conversor();
		String valorConvertido = conversor.ConverteTemperatura(conversaoDeTemperatura, valor);
		RetornaValor(valorConvertido);
		desejaContinuar();
	}

	/**
	 * Retorna o valor final do projeto
	 * 
	 * @param valor recebe o resultado da conversão, podendo ser entre a conversão
	 *              de moeda ou a conversão de Temperatura.
	 */
	public void RetornaValor(String valor) {
		JOptionPane.showMessageDialog(null, "O valor da conversão é de: " + valor + ".");

	}

	/**
	 * Janela responsável por verificar se o programa irá ou não ser reutilizado.
	 */
	public void desejaContinuar() {

		// Se sim = 0; se não = 1; se cacelar = 2;

		int retorno = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Selecione uma Opção",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (retorno == 1) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado.");
			System.exit(0);
		}

		if (retorno == 2) {
			JOptionPane.showMessageDialog(null, "Programa Concluido!");
			System.exit(0);
		}

		MenuPrincipal();
	}
}
