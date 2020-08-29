package br.com.fiap.tds.vetor.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		//Ler a quantidade de números
		System.out.println("Digite a qtd de números:");
		int qtd = leitor.nextInt();
		
		//Lista de números
		List<Integer> lista = new ArrayList<Integer>();
		
		//Loop -> ler os números
		for (int i=0; i<qtd; i++) {
			System.out.println("Digite o " + (i + 1) + " número");
			lista.add(leitor.nextInt());
		}
		
		//variável que armazena o maior número, começa com o valor da primeira posição da lista
		int maior = lista.get(0);
		
		//Loop -> verificar o maior número
		for (int i=1; i < lista.size(); i++) {
			if (maior < lista.get(i)) {
				maior = lista.get(i);
			}
		}
		
		//Exibir o maior número
		System.out.println("Maior número é: " + maior);
		
		leitor.close();
	}
}
