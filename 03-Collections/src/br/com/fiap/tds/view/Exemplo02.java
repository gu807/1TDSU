package br.com.fiap.tds.view;

import java.util.HashSet;
import java.util.Set;

public class Exemplo02 {

	public static void main(String[] args) {
		
		//Instanciar um Conjunto "Set"
		Set conjunto = new HashSet();
		
		//Adicionar objetos no conjunto
		conjunto.add("Segunda");
		conjunto.add("Terça");
		conjunto.add("Quarta");
		conjunto.add("Quinta");
		conjunto.add("Sexta");
		conjunto.add("Segunda"); //ignorado
		
		conjunto.remove("Segunda");
		
		//Exibe a quantidade de elementos na coleção
		System.out.println("Quantidade de elementos no set: " + conjunto.size());
		
		//Verificar se um objeto está na coleção
		System.out.println("Segunda está na coleção? " + conjunto.contains("Segunda"));
		
		//Verifica se o conjunto está vazio
		System.out.println("O conjunto possui valores? " + conjunto.isEmpty());
		
		//Exibir todos os valores do conjunto
		for (Object item : conjunto) {
			System.out.println(item);
		}
	}
	
}
