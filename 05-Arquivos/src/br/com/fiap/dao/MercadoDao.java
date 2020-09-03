package br.com.fiap.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Mercado;

/**
 * Classe responsável por acessar os dados do mercado no arquivo
 * @author Thiago Yamamoto
 */
public class MercadoDao {

	/**
	 * Grava as informações do mercado no arquivo, campos serparado por virgula
	 * @param mercado Objeto com as informações que serão gravadas no arquivo
	 */
	public void cadastrar(Mercado mercado) throws IOException {
	
		FileWriter outputStream = new FileWriter("mercados.txt", true);
		PrintWriter arquivo = new PrintWriter(outputStream);
		
		arquivo.println(mercado.getNome() + "," + mercado.getEndereco() + "," +
				mercado.getCnpj() + "," + mercado.getUnidades());
		
		arquivo.close();
		outputStream.close();
		
	}
	
	/**
	 * Lê o arquivo e recupera os mercados
	 * @return lista de objetos mercado
	 */
	public List<Mercado> listar() throws FileNotFoundException, IOException {
		
		//Criar o arquivo objeto para ler o arquivo
		FileReader inputStream = new FileReader("mercados.txt");
		
		//Criar o BufferedReader e uma lista de mercado
		BufferedReader arquivo = new BufferedReader(inputStream);		
		List<Mercado> lista = new ArrayList<Mercado>();
		
		String linha; //variável auxiliar
		
		//Ler cada linha do arquivo e instanciar um mercado
		while ((linha = arquivo.readLine()) != null) {
			//Separa os textos pela virgula ([0] nome, [1] end, [3] cnpj, [4] qtd
			String[] valores = linha.split(",");
			
			//Instancia o mercado com os valores do arquivo texto
			Mercado mercado = new Mercado(valores[0], valores[1], 
					Long.parseLong(valores[2]), Integer.parseInt(valores[3]));
			
			//Adicionar o mercado na lista
			lista.add(mercado);
		}
		
		//Fechar
		arquivo.close();
		inputStream.close();
		
		//retornar a lista de mercado
		return lista;
	}
	
}



