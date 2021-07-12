package br.com.generation.exercicios0107;

/* Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:
 * d = /(x2 - x1)^2 + (y2-y1)^2 
 */

import java.util.Scanner;

public class LeituraRaiz {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		double x1, y1, x2, y2, X, Y, resultado;

		System.out.println("Informe um valor para x1: ");
		x1 = read.nextDouble();

		System.out.println("Informe um valor para x2: ");
		x2 = read.nextDouble();

		System.out.println("Informe um valor para y1: ");
		y1 = read.nextDouble();

		System.out.println("Informe um valor para y2: ");
		y2 = read.nextDouble();

		// c�lculo pot�ncia
		X = Math.pow(x2 - x1, 2.0);

		Y = Math.pow(y2 - y1, 2.0);

		// c�lculo raiz quadrada
		resultado = Math.sqrt(X + Y);

		System.out.println("A raiz quadrada � " + resultado + ".");

		read.close();
	}

}
