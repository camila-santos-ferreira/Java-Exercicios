package br.com.generation.exercicios0807;

public class Preguica extends Animal {

	private double altura;

	public void subirArvore(double metros) {
		altura += metros;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
