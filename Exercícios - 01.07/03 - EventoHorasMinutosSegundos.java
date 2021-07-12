package br.com.generation.exercicios0107;

/* Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */ 

import java.util.Scanner;

public class EventoHorasMinutosSegundos {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int segundos, resultadoHoras, resultadoMinutos, resultadoSegundos;

		System.out.println("Informe o total de segundos: ");
		segundos = read.nextInt();

		// convers�o dos segundos em horas
		resultadoHoras = segundos / 3600;
		resultadoMinutos = (segundos % 3600) / 60;
		resultadoSegundos = (segundos % 3600) % 60;

		System.out.println("O resultado � " + resultadoHoras + " horas, " + resultadoMinutos + " minutos e "
				+ resultadoSegundos + " segundos.");

		read.close();
	}

}
