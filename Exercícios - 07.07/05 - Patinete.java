package br.com.generation.exercicios0707;

/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informações deste objeto no console.*/

public class Patinete {
	
	// Atributos
	private String marca;
	private String cor;
	private String recomendacao;
	private int tamanhoComprimento;
	private int tamanhoAltura;
	private int tamanhoLargura;
	private double valor;
	
	// Métodos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getRecomendacao() {
		return recomendacao;
	}
	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getTamanhoComprimento() {
		return tamanhoComprimento;
	}
	public void setTamanhoComprimento(int tamanhoComprimento) {
		this.tamanhoComprimento = tamanhoComprimento;
	}
	public int getTamanhoAltura() {
		return tamanhoAltura;
	}
	public void setTamanhoAltura(int tamanhoAltura) {
		this.tamanhoAltura = tamanhoAltura;
	}
	public int getTamanhoLargura() {
		return tamanhoLargura;
	}
	public void setTamanhoLargura(int tamanhoLargura) {
		this.tamanhoLargura = tamanhoLargura;
	}

}
