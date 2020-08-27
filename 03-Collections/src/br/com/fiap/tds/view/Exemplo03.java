package br.com.fiap.tds.view;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo03 {

	public static void main(String[] args) {
		//Instanciar um Mapa
		Map<String,String> mapa = new HashMap<String,String>();
		
		//Adiciona valores no mapa chave,valor
		mapa.put("Acre", "Rio Branco");
		mapa.put("Amazonas", "Manaus");
		mapa.put("São Paulo", "São Paulo");
		mapa.put("Pernambuco", "Recife");
		mapa.put("Roraima", "Rio Branco"); //Teste...
		
		//Remover um elemento do mapa
		mapa.remove("Roraima");

		//Exibir a quantidade de elementos no mapa
		System.out.println("Quantidade de elementos: " + mapa.size());
		
		//Exibir o valor armazenado na chave "Amazonas"
		System.out.println("Amazonas: " + mapa.get("Amazonas"));
		
		//Verificar se existe a chave "Pernambuco"
		System.out.println("Possui a chave Pernambuco: " + mapa.containsKey("Pernambuco"));
		
		//Verificar se existe o valor "São Paulo"
		System.out.println("Possui o valor São Paulo: " + mapa.containsValue("São Paulo"));
		
		//Recuperar todas as chaves do mapa
		Set<String> chaves = mapa.keySet();
		//Exibir todas as chaves
		for (String chave : chaves) {
			System.out.println("Chave: " + chave + " - Valor: " + mapa.get(chave));
		}
		
		//Recuperar todos os valores do mapa
		Collection<String> valores = mapa.values();
		for (String valor : valores) {
			System.out.println(valor);
		}
		
		//Remove todos os elementos
		mapa.clear();
	}
	
}
