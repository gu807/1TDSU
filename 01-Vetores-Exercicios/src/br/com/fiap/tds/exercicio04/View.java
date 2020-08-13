package br.com.fiap.tds.exercicio04;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler a quantidade de pessoas
		System.out.println("Digite a quantidade de pessoas");
		int qtd = leitor.nextInt();
		
		//Criar o vetor de pessoas com a qtd informada
		int[] vetor = new int[qtd];
		
		//Loop -> ler a idade das pessoas
		for (int i=0; i < vetor.length; i++) {
			System.out.println("Digite a idade da pessoa " + (i + 1));
			vetor[i] = leitor.nextInt();
		}
		
		//Criar a variável de eleitores obrigatórios
		int obrigatorios = 0;
		
		//Loop -> determinar a classe eleitoral e somar o nr de eleitores obrigatórios
		for (int i =0; i < vetor.length; i++) {
			if (vetor[i] < 16) {
				System.out.println("Pessoa " + (i + 1) + ": Não eleitor");
			} else if (vetor[i] >=18 && vetor[i] <=65) {
				System.out.println("Pessoa " + (i + 1) + " : Eleitor obrigatório");
				obrigatorios++;
			} else {
				System.out.println("Pessoa " + (i + 1) + " : Eleitor facultativo");
			}
		}
		
		//Exibir a qtd de eleitore obrigatórios
		System.out.println("Total de eleitores obrigatórios: " + obrigatorios);
		
		leitor.close();
	}
	
}
