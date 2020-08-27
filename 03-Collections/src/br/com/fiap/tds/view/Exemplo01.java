package br.com.fiap.tds.view;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe com exemplos de uso de List do Java
 */
public class Exemplo01 {

	public static void main(String[] args) {
		
		//Declarar uma lista de nomes e instanciar a lista
		List<String> nomes = new ArrayList<String>();
		
		//Adicionar dois nomes na lista
		nomes.add("Kelly");
		nomes.add("Gustavo"); //adiciona na última posição da lista
		
		nomes.add(1,"Gabriel"); //adiciona o objeto na posição específica
		nomes.set(1,"Marcus"); //adiciona o objeto na posição (substitui)
		
		//Exibir a quantidade de elementos na lista
		System.out.println("Elementos na lista: " + nomes.size());
		
		//Procurar o index de um objeto específico
		System.out.println("Posição do Gustavo " + nomes.indexOf("Gustavo"));
		
		//Verificar se o "gustavo" está na lista
		if (nomes.contains("Gustavo")) {
			System.out.println("Gustavo está na lista");
		}else {
			System.out.println("Gustavo não está na lista");
		}
		
		//Validar se a lista está vazia
		if (nomes.isEmpty()) {
			System.out.println("A lista está vazia");
		}else {
			System.out.println("A lista possui elementos");
		}
		
		//Remove um elemento da lista
		nomes.remove("Kelly"); // passar o objeto
		//nomes.remove(0); // passar a posição (index)
		
		//Exibir todos os elementos da lista
		for (int i=0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("Foreach");
		for (String item : nomes) {
			System.out.println(item);
		}
		
		//remover todos os objetos da coleção
		//nomes.clear(); 
		
		System.out.println("Total de elementos na lista " + nomes.size());
		
		//Obtem uma sublista da lista original 
		List<String> subLista = nomes.subList(0, 1); 
		
		//Transforma uma coleção em um vetor
		Object[] vetor = nomes.toArray();
		
		System.out.println("Total de elementos no vetor: " + vetor.length);
		
	}	
}
