package br.com.generation.exercicios0707;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		// Criação do objeto
		ContaBancaria conta = new ContaBancaria();
		
		conta.setBanco("Gen");
		conta.setNome("Camila Santos Ferreira");
		conta.setAgencia(347);
		conta.setConta(07142);
		conta.setSaldo(3.58);
		conta.setChequeEspecial(123.00);
		conta.setExtrato("\nCompra Mercado - (56,73)" + "\nCompra Farmácia - (12,45)" + "\nPagamento Boleto - (97,61)");
		
		// Impressão
		System.out.println("-------------------------------Conta Bancária--------------------------------");
		System.out.println("-------------------------------------" + conta.getBanco() + "-------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Nome: " + conta.getNome());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getConta());		
		System.out.println("-----------------------------------------------------------------------------");		
		System.out.println("Saldo: R$" + conta.getSaldo());
		System.out.println("Cheque Especial: R$" + conta.getChequeEspecial());
		System.out.println("Extrato:" + conta.getExtrato());

	}

}
