package br.com.fiap.tds.exercicio06;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Ler a quantidade de números
		System.out.println("Digite a quantidade de números");
		int qtd = leitor.nextInt();
		
		//Criar o vetor com a qtd de números
		short[] vetor = new short[qtd];
		
		//Variável para ir armazenando os números ímpares
		short impar = 1;
		
		//Loop -> carregar o vetor com os primeiros números ímpares
		for (int i =0; i < vetor.length; i++) {
			vetor[i] = impar;
			impar += 2;
		}
		
		//Loop -> exibir os valores
		for (short x : vetor) {
			System.out.println(x);
		}
		
		leitor.close();
	}
	
}
