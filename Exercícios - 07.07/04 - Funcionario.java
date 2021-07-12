package br.com.generation.exercicios0707;

/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.*/

public class Funcionario {
	
	// Atributos
	private String nome;
	private String sexo;
	private String funcao;
	private int matricula;
	
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
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	private int idade;
	private double salario;
	
}
