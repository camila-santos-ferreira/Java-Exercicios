package br.com.generation.exercicios0707;

/* Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

public class Aviao {
	
	//Atributos
	private String companhia;
	private String identificacao;
	private String destino;
	private String data;
	private int poltronasLivres;
	
	//M�todos
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getPoltronasLivres() {
		return poltronasLivres;
	}
	public void setPoltronasLivres(int poltronasLivres) {
		this.poltronasLivres = poltronasLivres;
	}

}
