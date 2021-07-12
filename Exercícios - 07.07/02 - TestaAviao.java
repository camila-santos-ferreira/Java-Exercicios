package br.com.generation.exercicios0707;

public class TestaAviao {

	public static void main(String[] args) {
		
		//Criação do objeto
		Aviao aviao = new Aviao();
		
		aviao.setCompanhia("TAM");
		aviao.setIdentificacao("5867-3");
		aviao.setDestino("Japão");
		aviao.setData("08/07/2021");
		aviao.setPoltronasLivres(34);
		
		// Impressão
		System.out.println("--------------------------------Painel de Voos-------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Companhia de Voo: " + aviao.getCompanhia());
		System.out.println("Nº de Identificação do Voo: " + aviao.getIdentificacao());
		System.out.println("Destino: " + aviao.getDestino());
		System.out.println("Data do Voo: " + aviao.getData());
		System.out.println("Quantidade de Poltronas Livres: " + aviao.getPoltronasLivres());
		

	}

}
