package br.com.fiap.tds.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio01 {

	/*
	 * Crie um programa em Java para ler um arquivo texto e escrever apenas 
	 * os caracteres alfabéticos(letras) e o espaço para um arquivo de destino. 
	 * Números e caracteres especiais devem ser desconsiderados.
	 */
	public static void main(String[] args) {
		
		
		try {
			//Ler o arquivo exercicio1.txt
			FileReader inputStream = new FileReader("exercicio1.txt");
			BufferedReader arquivoLeitura = new BufferedReader(inputStream);
			
			//Escrever o arquivo com o resultado
			FileWriter outputStream = new FileWriter("exercicio1-resposta.txt");
			PrintWriter arquivoEscrita = new PrintWriter(outputStream);
			
			String linha; 
			
			//Ler todas as linhas do arquivo 
			while ((linha = arquivoLeitura.readLine()) != null) {
				//Escrever a linha filtrada no arquivo de destino
				linha = linha.replaceAll("[^A-z ]", "");
				arquivoEscrita.println(linha);
				//arquivoEscrita.println(linha.replaceAll("[^A-z ]", ""));
			}
			
			System.out.println("Arquivo processado!");
			
			//Fechar
			arquivoLeitura.close();
			arquivoEscrita.close();
			inputStream.close();
			outputStream.close();
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		String texto = "askçl545&&&&s dfad&&sdéAdfsdf";
		
		//Regexp
		//Valida se o texto contem somente caracteres A-z
		boolean ok = texto.matches("[A-z]*");
		System.out.println(ok);
		
		//Substituir os caracteres especiais e número por ""
		texto = texto.replaceAll("[^A-z ]", "");
		
		System.out.println(texto);
		*/
	}
	
}