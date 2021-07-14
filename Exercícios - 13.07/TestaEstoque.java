package br.com.generation.exercicios1307;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		ArrayList<Estoque> produtos = new ArrayList<>();

		System.out.print("Quantos produtos você quer add: ");
		int numProd = reader.nextInt();
		int i;

		for (i = 0; i < numProd; i++) {
			System.out.print("Nome: ");
			String nomeProduto = reader.nextLine();
			reader.nextLine();

			System.out.print("Quantidade: ");
			int quantidadeProduto = reader.nextInt();
			

			produtos.add(new Estoque(nomeProduto, quantidadeProduto));

		}
		for (Estoque u : produtos) {
			System.out.println(u);
		}

		int resposta;
		do {
			System.out.println();
			System.out.println("Deseja remover um item? \n1 - Sim | 2 - Não");
			resposta = reader.nextInt();
			if (resposta == 1) {
				System.out.println();
				System.out.println("Informe o índice do produto: ");
				i = reader.nextInt();
				produtos.get(i);
				produtos.remove(i - 1);
				for (i = 0; i < produtos.size(); i++) {
					System.out.println(produtos.get(i));
				}
			}

		} while (resposta == 1);
		System.out.println("Inclusão/Exclusão Encerrada");
		reader.close();
	}

	
	

}
