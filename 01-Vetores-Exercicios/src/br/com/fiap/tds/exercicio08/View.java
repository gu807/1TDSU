package br.com.fiap.tds.exercicio08;

import java.util.Scanner;

public class View {
	
	
	//Obs. Uma solução melhor é ordenar o vetor para determinar os valores iguais.
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Criar o vetor de char com 30 posições
		char[] vetor = new char[30];
		
		//Loop -> ler os valores do vetor
		for (int i =0; i < vetor.length; i ++) {
			System.out.println("Digite o " + (i +1) + " caractere:");
			vetor[i] = leitor.next().charAt(0); //Lê uma string, mas armazena somente o primeiro char
		}
		
		//Vetor auxiliar que armazena os valores repetidos
		char[] iguais = new char[15];
		//Variável de controle do indíce do vetor de iguais
		int index = 0;
		
		//Loop -> verificar se existe valores iguais (percorre cada posição do vetor e valida no vetor se possui valor igual)
		for (int i =0; i < vetor.length; i++) {
			//Valor que será validado se possui igual no vetor
			char c = vetor[i];
			//Loop -> percorre todo o vetor e valida se existe o valor (armazenado em c) igual
			for (int j = 0; j < vetor.length; j++) { 
				//Loop -> valida se o número que será testado já foi encontrado anteriormente
				boolean achou = false;
				for (int k =0; k < index; k ++) {
					if (c == iguais[k])
						achou = true;
				}	
				if (vetor[j] == c && i != j && !achou) { //valida se o valor é igual e se não está testando a mesma posição do vetor
					iguais[index] = c; //armazena o valor encontrado no vetor auxiliar
					index++; //incrementa o index do vetor auxiliar
					break; //como encontrou um valor igual, pode sair do loop interno (j), retornando para o loop externo
				}
				
			}
		}
		
		//Exibe os valores do vetor
		for (char c : vetor) {
			System.out.print(c + " ");
		}
		
		//Exibe a qtd de valores iguais encontrados
		System.out.println("\n\nValores iguais: " + index);
		//Exibe os valore iguais encontrados
		for (char c : iguais) {
			System.out.println(c);
		}
		
		
		leitor.close();
	}

}