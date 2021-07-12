package br.com.generation.exercicios0807;

public class Cachorro extends Animal {
	
	private int velocidade;

	public void correr(int aceleracao) {
		velocidade += aceleracao;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
