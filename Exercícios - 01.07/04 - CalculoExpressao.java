package br.com.generation.exercicios0107;

/* Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
 * D = (R+S)/2, onde, R = (A+B)^1 S = (B+C)^2  
 */ 

import java.util.Scanner;

public class CalculoExpressao {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int A, B, C;
		double R, S, D = 0;

		System.out.println("Informe um valor para A: ");
		A = read.nextInt();

		System.out.println("Informe um valor para B: ");
		B = read.nextInt();

		System.out.println("Informe um valor para C: ");
		C = read.nextInt();

		// potencia de A + B
		R = Math.pow(A + B, 2);
		// potencia de B + C
		S = Math.pow(B + C, 2);

		D = (R + S) / 2;

		System.out.println("O resultado de D é: " + D + ".");

		read.close();
	}

}
