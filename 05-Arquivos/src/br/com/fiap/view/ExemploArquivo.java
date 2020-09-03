package br.com.fiap.view;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploArquivo {

	public static void main(String[] args) {
		
		//Criar um objeto que representa um diretório (pasta)
		File diretorio = new File("aulas");
		
		//Validar se o diretório não existe
		if (!diretorio.exists())
			diretorio.mkdir(); //cria o diretório
		else
			diretorio.delete(); //apaga o diretório
		
		//Criar um arquivo com um diretório
		File arquivo = new File(diretorio, "aula01.txt");
		
		try {
			//Valida se o arquivo existe
			if (!arquivo.exists())
				arquivo.createNewFile(); //cria um novo arquivo
			
			//Escrever...
			PrintWriter writer = new PrintWriter(arquivo);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}//main
	
}//classe
