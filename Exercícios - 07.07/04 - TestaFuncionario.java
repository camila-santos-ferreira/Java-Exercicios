package br.com.generation.exercicios0707;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		// Cria��o do objeto
		Funcionario funcionario = new Funcionario();

		funcionario.setMatricula(100457);
		funcionario.setNome("Camila Santos Ferreira");
		funcionario.setIdade(21);
		funcionario.setSexo("Feminino");
		funcionario.setFuncao("Desenvolvedora Java");
		funcionario.setSalario(5000.00);
		
		// Impress�o
		System.out.println("-----------------------Ficha Cadastral de Funcion�rios-----------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Matr�cula: " + funcionario.getMatricula());
		System.out.println("Nome do(a) funcion�rio(a): " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade() + " anos");
		System.out.println("Sexo: " + funcionario.getSexo());
		System.out.println("Cargo: " + funcionario.getFuncao());
		System.out.println("Sal�rio: R$" + funcionario.getSalario());

	}

}
