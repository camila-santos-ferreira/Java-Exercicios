package br.com.generation.exercicios0107;

/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 *escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
 */

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		double valorCarro, percentagem = 0.28, impostos = 0.45, custoTotal;

		System.out.println("Informe o valor do carro R$: ");
		valorCarro = read.nextDouble();

		custoTotal = valorCarro + valorCarro * (percentagem + impostos);

		System.out.println("O custo total do carro é R$" + custoTotal + ".");

		read.close();
	}

}
