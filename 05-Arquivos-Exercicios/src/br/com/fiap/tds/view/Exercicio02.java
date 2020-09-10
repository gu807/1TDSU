package br.com.fiap.tds.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Crie um programa em Java para ler um arquivo texto, onde cada linha contém 
 * dois números inteiros separados por vírgula. 
 * Este programa deve utilizar o arquivo de entrada citado acima 
 * para gerar um arquivo com 3 campos, sendo o terceiro o valor da soma 
 * dos outros dois citados anteriormente.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		try {
			//Ler o arquivo exercicio2.txt
			FileReader inputStream = new FileReader("exercicio2.txt");
			BufferedReader arquivoLeitura = new BufferedReader(inputStream);
			
			//Escrever o arquivo de resposta
			FileWriter outputStream = new FileWriter("exercicio2-resposta.txt");
			PrintWriter arquivoEscrita = new PrintWriter(outputStream);
			
			String linha;
			
			//Percorrer todas as linhas do arquivo
			while ((linha = arquivoLeitura.readLine()) != null) {
				//Pegar os números
				//Separar os números através da virgula
				String[] numeros = linha.split(",");

				//Converter a string para números
				int n1 = Integer.parseInt(numeros[0]);
				int n2 = Integer.parseInt(numeros[1]);
				//Somar
				int soma = n1 + n2;
				
				//Escrever no arquivo de resposta
				arquivoEscrita.println(n1 + "," + n2 + "," + soma);
			}
			
			System.out.println("Cálculos realizados!");
			
			//Fechar
			arquivoEscrita.close();
			arquivoLeitura.close();
			inputStream.close();
			outputStream.close();
		
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main
	
}//classe

