package br.com.generation.exercicios0807;

public class TestaAnimais {

	public static void main(String[] args) {
		
		// Objetos
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("----------Dados do Cachorro----------");
		
		// Atributos
		cachorro.setNome("Ducke");
		cachorro.setIdade(2);
		cachorro.setEmitirSom("AU AU!!!");
		cachorro.setVelocidade(20);
		
		// Impress�o
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade() + " anos");
		System.out.println("Som: " + cachorro.getEmitirSom());
		System.out.println("Velocidade: " + cachorro.getVelocidade() + "km/h");
		System.out.println();
		
		System.out.println("-----------Dados do Cavalo-----------");
		
		// Atributos
		cavalo.setNome("Afonso");
		cavalo.setIdade(10);
		cavalo.setEmitirSom("IRRRIII, RILINCHIN!!!");
		cavalo.setVelocidade(60);
		
		// Impress�o
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade() + " anos");
		System.out.println("Som: " + cavalo.getEmitirSom());
		System.out.println("Velocidade: " + cavalo.getVelocidade() + "km/h");
		System.out.println();

		
		System.out.println("----------Dados da Pregui�a----------");
		
		// Atributos
		preguica.setNome("Boo");
		preguica.setIdade(5);
		preguica.setEmitirSom("HUUUMMMM!!!");
		preguica.setAltura(37.6);
		
		// Impress�o
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade() + " anos");
		System.out.println("Som: " + preguica.getEmitirSom());
		System.out.println("Altura que a pregui�a subiu: " + preguica.getAltura() + "m");

	}

}
