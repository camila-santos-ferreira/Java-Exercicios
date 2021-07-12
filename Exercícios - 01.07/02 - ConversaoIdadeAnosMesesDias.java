package br.com.generation.exercicios0107;

/* Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */

import java.util.Scanner;

public class ConversaoIdadeAnosMesesDias {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int dias, resultadoAnos, resultadoMeses, resultadoDias;

		System.out.println("Informe quantos dias de vida você tem: ");
		dias = read.nextInt();

		resultadoAnos = dias / 365;
		// resto dos dias dividido por 30 (mês)
		resultadoMeses = (dias % 365) / 30;
		// resto dos dias em relação ao mês
		resultadoDias = (dias % 365) % 30;

		System.out.println("Você tem " + resultadoAnos + " ano(s), " + resultadoMeses + " meses e " + resultadoDias
				+ " dia(s) de vida.");

		read.close();

	}

}
