package br.com.fiap.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploEscrita {

	//Escrever dados em um arquivo
	public static void main(String[] args) {
		
		try {
			//Abrir o arquivo (stream) - Construtor com nome do arquivo , true para não sobrescrever
			FileWriter outputStream = new FileWriter("log.txt", true);
			
			//Instanciar o objeto especializado em escrever texto
			PrintWriter arquivo = new PrintWriter(outputStream);
			
			//Escrever no arquivo
			arquivo.println("Exemplo de escrita 2!");
			
			System.out.println("Escrevendo no arquivo!");
			
			//Fecha
			arquivo.close();
			outputStream.close();
		
		} catch(IOException e) {
			System.out.println("Erro ao abrir/criar o arquivo");
			e.printStackTrace();
		}
		
	}//main
	
}//classe