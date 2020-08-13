package br.com.fiap.tds.exercicio07;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar o vetor
		double[] vetor = new double[16];
		
		//Loop -> ler os números
		for (int i=0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + " número");
			vetor[i] = leitor.nextDouble();
		}
		
		//Loop -> exibe o vetor original
		System.out.println("Vetor original");
		System.out.print("[");
		for (int i =0; i < vetor.length; i ++) {
			//Identifica se não é o último número para não colocar a virgula
			if (i != vetor.length-1)
				System.out.print(vetor[i]+", ");
			else
				System.out.print(vetor[i]);
		}
		System.out.print("]");
		
		//Vetor auxiliar para armazenar os 8 primeiros números
		double[] aux = new double[8];
		
		//Loop -> armazena os 8 primeiros números no vetor auxiliar e coloca os valores das 8 últimas posições nas primeiras
		for (int i =0; i < 8 ; i ++) {
			aux[i] = vetor[i];
			vetor[i] = vetor[i +8];
		}
		
		//Loop -> utiliza o vetor auxiliar para colocar os primeiros números nas ultimas posições
		for (int i=0; i < 8; i++) {
			vetor[i+8] = aux[i];
		}
		
		//Loop -> exibe o vetor final
		System.out.println("\nVetor final");
		System.out.print("[");
		for (int i =0; i < vetor.length; i ++) {
			//Identifica se não é o último número para não colocar a virgula
			if (i != vetor.length-1)
				System.out.print(vetor[i]+", ");
			else
				System.out.print(vetor[i]);
		}
		System.out.print("]");
		
		leitor.close();
	}
	
}
