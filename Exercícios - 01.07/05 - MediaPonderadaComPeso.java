package br.com.generation.exercicios0107;

/* Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */

import java.util.Scanner;

public class MediaPonderadaComPeso {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		double media1, media2, media3, resultado;

		System.out.println("Informe a 1ª nota: ");
		media1 = read.nextDouble();

		System.out.println("Informe a 2ª nota: ");
		media2 = read.nextDouble();

		System.out.println("Informe a 3ª nota: ");
		media3 = read.nextDouble();

		resultado = (media1 * 2 + media2 * 3 + media3 * 5) / 10;

		System.out.println("A média final é " + resultado + ".");

		read.close();

	}

}
