package br.com.generation.exercicios0707;

/* Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

public class ProdutoEletronico {
	
	//Atributos
	private String tipo;
	private String marca;
	private String modelo;
	private String condicao;
	private double valor;
	
	// M�todos
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCondicao() {
		return condicao;
	}
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
