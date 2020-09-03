package br.com.fiap.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//CTRL + SHIFT + o -> imports

public class ExemploLeitura {

	//Ler os dados de um arquivo
	public static void main(String[] args) {
		
		try {
			//Abrir o arquivo (input stream)
			FileReader inputStream = new FileReader("log.txt");
			//Instanciar o objeto para ler o arquivo texto
			BufferedReader arquivo = new BufferedReader(inputStream);
			
			//Variável que recebe cada linha do arquivo lido
			String linha;
			
			//Permite adicionar strings no objeto, sem criar um novo objeto
			StringBuffer buffer = new StringBuffer();
			
			//Ler uma linha enquanto a linha não for null
			while ((linha = arquivo.readLine()) != null) {
				buffer.append(linha).append("\n");
			}
			
			System.out.println(buffer);
			
			//Fechar
			arquivo.close();
			inputStream.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("Erro de leitura do arquivo!");
			e.printStackTrace();
		}
		
	}//main
	
}//classe
