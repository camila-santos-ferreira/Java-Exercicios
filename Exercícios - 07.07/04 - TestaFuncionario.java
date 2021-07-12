package br.com.generation.exercicios0707;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		// Criação do objeto
		Funcionario funcionario = new Funcionario();

		funcionario.setMatricula(100457);
		funcionario.setNome("Camila Santos Ferreira");
		funcionario.setIdade(21);
		funcionario.setSexo("Feminino");
		funcionario.setFuncao("Desenvolvedora Java");
		funcionario.setSalario(5000.00);
		
		// Impressão
		System.out.println("-----------------------Ficha Cadastral de Funcionários-----------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Nome do(a) funcionário(a): " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade() + " anos");
		System.out.println("Sexo: " + funcionario.getSexo());
		System.out.println("Cargo: " + funcionario.getFuncao());
		System.out.println("Salário: R$" + funcionario.getSalario());

	}

}
