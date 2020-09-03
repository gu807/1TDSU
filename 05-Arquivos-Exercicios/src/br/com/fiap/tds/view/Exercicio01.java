package br.com.fiap.tds.view;

public class Exercicio01 {

	/*
	 * Crie um programa em Java para ler um arquivo texto e escrever apenas 
	 * os caracteres alfabéticos(letras) e o espaço para um arquivo de destino. 
	 * Números e caracteres especiais devem ser desconsiderados.
	 */
	public static void main(String[] args) {
		
		String texto = "askçl545&&&&s dfad&&sdéAdfsdf";
		
		//Regexp
		//Valida se o texto contem somente caracteres A-z
		boolean ok = texto.matches("[A-z]*");
		System.out.println(ok);
		
		//Substituir os caracteres especiais e número por ""
		texto = texto.replaceAll("[^A-z ]", "");
		
		System.out.println(texto);
		
	}
	
}