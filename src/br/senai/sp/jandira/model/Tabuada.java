package br.senai.sp.jandira.model;

public class Tabuada {
	public int multiplicando, minimoMultiplicador, // 7
			maximoMultiplicador; // 28

	public String[] getTabuada() {

		int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;
		while (contador < tamanho) {
			int produto = multiplicando * minimoMultiplicador;

			String resultado = multiplicando + " x " + minimoMultiplicador + " = " + produto;
			tabuada[contador] = resultado;

			contador++;
			minimoMultiplicador++;

		}

		return tabuada;
	}

}
