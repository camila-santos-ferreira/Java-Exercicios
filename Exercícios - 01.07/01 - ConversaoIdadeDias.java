package br.com.generation.exercicios0107;

/* Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */ 

// biblioteca scanner
import java.util.Scanner;

public class ConversaoIdadeDias {

	public static void main(String[] args) {

		// definir o scanner
		Scanner read = new Scanner(System.in);

		// declara��o das vari�veis
		int anos, meses, dias, resultado;

		// solicita��o para o usu�rio informar a idade
		System.out.println("Informe quantos anos de vida voc� tem: ");
		anos = read.nextInt();

		// solicita��o para o usu�rio informar os meses
		System.out.println("Informe quantos meses de vida voc� tem: ");
		meses = read.nextInt();

		// solicita��o para o usu�rio informar os dias
		System.out.println("Informe quantos dias de vida voc� tem: ");
		dias = read.nextInt();

		// f�rmula para convers�o dos anos e meses em dias + soma dos dias
		resultado = (anos * 365 + meses * 30 + dias);

		System.out.println("A idade expressa em dias � igual a: " + resultado + " dias.");

		read.close();
	}

}
