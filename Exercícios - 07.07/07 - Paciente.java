package br.com.generation.exercicios0707;

/*Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.*/

public class Paciente {
	
	// Atributos
	private String nome;
	private String sexo;
	private String especialidade;
	private String telefone;
	private String saude;
	private int idade;
	private double peso;
	private double altura;
	
	// Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSaude() {
		return saude;
	}
	public void setSaude(String saude) {
		this.saude = saude;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
