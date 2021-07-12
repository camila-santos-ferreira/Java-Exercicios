package br.com.generation.exercicios0707;

public class TestaPaciente {

	public static void main(String[] args) {
		
		// Criação do objeto
		Paciente paciente = new Paciente();
		
		paciente.setNome("Camila Santos Ferreira");
		paciente.setIdade(21);
		paciente.setSexo("Feminino");
		paciente.setTelefone("+55 11 98889-0000");
		paciente.setPeso(44.2);
		paciente.setAltura(1.62);
		paciente.setEspecialidade("Cardiologista");
		paciente.setSaude("Saudável");
		
		// Impressão
		System.out.println("-------------------------------Ficha Paciente--------------------------------");
		System.out.println("--------------------Especialidade: " + paciente.getEspecialidade() + "-----------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Dados Cadastrais");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Idade: " + paciente.getIdade() + " anos");
		System.out.println("Sexo: " + paciente.getSexo());
		System.out.println("Contato: " + paciente.getTelefone());
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Dados Físicos e Saúde");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Peso: " + paciente.getPeso() + "kg");
		System.out.println("Altura: " + paciente.getAltura() + "cm");
		System.out.println("Estado de Saúde: " + paciente.getSaude());

	}

}
