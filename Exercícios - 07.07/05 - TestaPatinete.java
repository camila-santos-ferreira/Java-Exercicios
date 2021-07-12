package br.com.generation.exercicios0707;

public class TestaPatinete {

	public static void main(String[] args) {

		// Criação do objeto
		Patinete patineteInfantil = new Patinete();
		
		patineteInfantil.setMarca("Patikids");
		patineteInfantil.setCor("Azul");
		patineteInfantil.setTamanhoComprimento(61);
		patineteInfantil.setTamanhoLargura(19);
		patineteInfantil.setTamanhoAltura(70);
		patineteInfantil.setRecomendacao("Recomendado para crianças de até 05 (cinco) anos");
		patineteInfantil.setValor(149.99);
		
		// Impressão
		System.out.println("------------------------------Patinete Infantil------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Marca: " + patineteInfantil.getMarca());
		System.out.println("Cor: " + patineteInfantil.getCor());
		System.out.println("Recomendação: " + patineteInfantil.getRecomendacao());
		System.out.println("Comprimento: " + patineteInfantil.getTamanhoComprimento() + "cm");
		System.out.println("Largura: " + patineteInfantil.getTamanhoLargura() + "cm");
		System.out.println("Altura: " + patineteInfantil.getTamanhoAltura() + "cm");
		System.out.println("Valor: R$" + patineteInfantil.getValor());
		

	}

}
