package br.com.fiap.tds.view;

public class Exemplo01 {

	public static void main(String[] args) {
		
		//Declarar um vetor de int
		int[] notas;
		
		//Instanciar um vetor com 5 posições
		notas = new int[5];
		
		//Atribui valores para as posições do vetor
		notas[0] = 10;
		notas[1] = 20;
		notas[2] = 30;
		notas[3] = 40;
		notas[4] = 50;
		
		//Exibir o valor da posição 3
		System.out.println(notas[3]);
		
		//Exibir o tamanho do vetor
		System.out.println(notas.length);
		
		System.out.println("Notas:");
		//Exibir todas as notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		//Foreach
		System.out.println("Notas com foreach:");
		for (int n : notas) {
			System.out.println(n);
		}
		
	}
	
}