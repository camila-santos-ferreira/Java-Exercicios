package br.com.generation.exercicios0707;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		// Criação do objeto
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
		
		produtoEletronico.setTipo("Celular");
		produtoEletronico.setMarca("Xiaomi");
		produtoEletronico.setModelo("Mi 9 Lite");
		produtoEletronico.setCondicao("Usado");
		produtoEletronico.setValor(631.99);
		
		// Impressão
		System.out.println("-------------------------Vitrine Produtos Eletrônicos------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Tipo de Produto: " + produtoEletronico.getTipo());
		System.out.println("Marca: " + produtoEletronico.getMarca());
		System.out.println("Modelo: " + produtoEletronico.getModelo());
		System.out.println("Condição de Uso: " + produtoEletronico.getCondicao());
		System.out.println("Valor: R$" + produtoEletronico.getValor());

	}

}
