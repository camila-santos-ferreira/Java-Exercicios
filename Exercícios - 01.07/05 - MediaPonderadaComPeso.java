package br.com.generation.exercicios0107;

/* Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */

import java.util.Scanner;

public class MediaPonderadaComPeso {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		double media1, media2, media3, resultado;

		System.out.println("Informe a 1� nota: ");
		media1 = read.nextDouble();

		System.out.println("Informe a 2� nota: ");
		media2 = read.nextDouble();

		System.out.println("Informe a 3� nota: ");
		media3 = read.nextDouble();

		resultado = (media1 * 2 + media2 * 3 + media3 * 5) / 10;

		System.out.println("A m�dia final � " + resultado + ".");

		read.close();

	}

}
