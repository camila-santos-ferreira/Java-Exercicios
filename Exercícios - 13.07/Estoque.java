package br.com.generation.exercicios1307;

public class Estoque {
	private String nomeProduto;
	private int quantidadeProduto;
	

	public Estoque(String nomeProd, int quantidadeProduto) {
		super();
		this.nomeProduto = nomeProd;
		this.quantidadeProduto = quantidadeProduto;
		
	}
	

	public String getNomeProd() {
		return nomeProduto;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProduto = nomeProd;
	}

	public double getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String toString() {
		return "[Nome do produto: " + this.nomeProduto + "Quantidade: " + this.quantidadeProduto + "]";
	}
}
