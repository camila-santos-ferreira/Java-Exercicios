package br.com.generation.exercicios0107;

/* Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */ 

// biblioteca scanner
import java.util.Scanner;

public class ConversaoIdadeDias {

	public static void main(String[] args) {

		// definir o scanner
		Scanner read = new Scanner(System.in);

		// declaração das variáveis
		int anos, meses, dias, resultado;

		// solicitação para o usuário informar a idade
		System.out.println("Informe quantos anos de vida você tem: ");
		anos = read.nextInt();

		// solicitação para o usuário informar os meses
		System.out.println("Informe quantos meses de vida você tem: ");
		meses = read.nextInt();

		// solicitação para o usuário informar os dias
		System.out.println("Informe quantos dias de vida você tem: ");
		dias = read.nextInt();

		// fórmula para conversão dos anos e meses em dias + soma dos dias
		resultado = (anos * 365 + meses * 30 + dias);

		System.out.println("A idade expressa em dias é igual a: " + resultado + " dias.");

		read.close();
	}

}
