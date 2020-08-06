package br.com.fiap.tds.exercicio02;

import java.util.Scanner;

public class View {

	/*
	 * Crie um programa em Java onde o usuário informa N números e ao final é
	 * impresso o maior entre eles.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Ler a quantidade de números e criar o vetor
		System.out.println("Digite a quantidade de números");
		int[] vetor = new int[sc.nextInt()];
		
		//Ler os números
		for (int i =0; i < vetor.length ; i++) {
			System.out.println("Digite o número da posição " + i);
			vetor[i] = sc.nextInt();
		}
		
		//Identificar o maior número
		int maior = vetor[0] ;
		for (int i = 1; i < vetor.length; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
		}
		
		//Exibir o maior número
		System.out.println("Maior número: " + maior);
				
		sc.close();
	}

}