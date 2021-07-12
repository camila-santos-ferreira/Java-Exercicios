package br.com.generation.exercicios0707;

/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informações deste objeto no console.*/

public class ContaBancaria {
	
	// Atributos
	private String banco;
	private String nome;
	private String extrato;
	private int agencia;
	private int conta;
	private double saldo;
	private double chequeEspecial;
	
	// Métodos
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getExtrato() {
		return extrato;
	}
	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
}
