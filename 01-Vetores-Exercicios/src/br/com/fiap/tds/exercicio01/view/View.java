package br.com.fiap.tds.exercicio01.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.exercicio01.bean.Produto;

public class View {

	public static void main(String[] args) {
		//Ler a quantidade de produtos
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de produtos"));
		
		//Declarar o vetor de produtos
		Produto[] produtos = new Produto[n];
		
		//Ler a quantidade, preco e desconto de cada produto
		for (int i=0; i < produtos.length; i ++) {
			int qtd = Integer.parseInt(JOptionPane.showInputDialog("Qtd"));
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
			double desc = Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
			
			produtos[i] = new Produto(qtd, preco, desc);
		}
		
		double valorTotal = 0;
		//Calcular o valor total
		for (Produto p : produtos) {
			
			//Exibe os dados dos produtos
			System.out.println("Qtd: " + p.getQuantidade() 
				+ "\nPreço: " + p.getPreco() + "\nDesconto: " + p.getDesconto() + "\n");
			
			//Calcula o valor final
			valorTotal += (p.getPreco() - p.getDesconto()) * p.getQuantidade();
		}
		
		//Exibir o valor total
		System.out.println("Valor total: " + valorTotal);
		
	}
	
}
