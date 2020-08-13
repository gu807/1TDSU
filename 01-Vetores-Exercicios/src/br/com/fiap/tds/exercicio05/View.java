package br.com.fiap.tds.exercicio05;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler a qtd de números que será informado
		System.out.println("Digite a qtd de números");
		int qtd = leitor.nextInt();
		
		//Criar o vetor de números com a qtd
		double[] vetor = new double[qtd];
		
		//Loop -> ler os números
		for (int i=0; i< vetor.length; i++) {
			System.out.println("Digite o número " + (i + 1));
			vetor[i] = leitor.nextDouble();
		}
		
		//Loop -> para exibir a sequencia na ordem contrária
		for (int i = vetor.length-1; i >=0; i--) {
			System.out.println(vetor[i]);
		}
		
		leitor.close();
	}
	
}
