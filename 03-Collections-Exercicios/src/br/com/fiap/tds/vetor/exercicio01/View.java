package br.com.fiap.tds.vetor.exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Resolve o exercício 01
 * @author thiagoyama
 *
 */
public class View {

	/**
	 * Método que inicializa a aplicação
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler a quantidade de produtos
		System.out.println("Digite a qtd de produtos:");
		int posicoes = leitor.nextInt();
		
		//Declarar uma lista de produtos 
		List<Produto> lista = new ArrayList<Produto>();
		
		/*Loop -> para ler todos os dados do produto, 
		 instanciar o produto e adicionar na lista 
		 */
		for (int i=0; i<posicoes; i++) {
			
			System.out.println("Digite o preço");
			double preco = leitor.nextDouble();
			
			System.out.println("Digite a quantidade");
			int qtd = leitor.nextInt();
			
			System.out.println("Digite o desconto (em %)");
			double desconto = leitor.nextDouble();
			
			Produto produto = new Produto(qtd,preco,desconto);
			
			//adiciona o objeto produto na lista
			lista.add(produto);
		}
		
		//variável para armazenar o valor total
		double valorTotal = 0;
		
		//Loop -> para calcular o valor total
		for (Produto p : lista) {
			System.out.println("Preço: " + p.getPreco() + " Qtd: " + p.getQuantidade() + " Desc:" + p.getDesconto());
			valorTotal += p.getPreco() * p.getQuantidade() * (100-p.getDesconto())/100;
		}
		
		//Exibir o valor total
		System.out.println("Valor total: " + valorTotal);
		
		leitor.close();
	}
	
}
