package br.com.generation.exercicios0107;

/* Um sistema de equações lineares do tipo: ax + by =c  dx + ey =f, pode ser resolvido segundo mostrado abaixo:
 * x = (ce-bf/ae-bd) y = (af-cd/ae-bd). Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
 */

import java.util.Scanner;

public class EquacaoLinear {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		double a, b, c, d, e, f, x, y;

		System.out.println("Informe o valor de a: ");
		a = read.nextDouble();

		System.out.println("Informe o valor de b: ");
		b = read.nextDouble();

		System.out.println("Informe o valor de c: ");
		c = read.nextDouble();

		System.out.println("Informe o valor de d: ");
		d = read.nextDouble();

		System.out.println("Informe o valor de e: ");
		e = read.nextDouble();

		System.out.println("Informe o valor de f: ");
		f = read.nextDouble();

		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);

		System.out.println("O valor de x é " + x + " e o valor de y é " + y + ".");

		read.close();
	}

}
