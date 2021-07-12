package br.com.generation.exercicios0707;

public class TestaCliente {

	public static void main(String[] args) {
		
		// Criação do objeto
		Cliente cliente = new Cliente();
		
		cliente.setNomeCompleto("Camila Santos Ferreira");
		cliente.setCPF("123.456.789-00");
		cliente.setTelefone("+55 1199999-8888");
		cliente.setEndereco("Rua Generation, 0, Jardim Generation, CEP 01234-546, São Paulo, SP");
		
		// Impressão
		System.out.println("--------------------------------Ficha Cliente--------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Nome do(a) cliente: " + cliente.getNomeCompleto());
		System.out.println("CPF: " + cliente.getCPF());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Endereco: " + cliente.getEndereco());
		
	}

}
