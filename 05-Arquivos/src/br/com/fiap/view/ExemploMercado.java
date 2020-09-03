package br.com.fiap.view;

import java.io.IOException;
import java.util.Scanner;

import br.com.fiap.bean.Mercado;
import br.com.fiap.dao.MercadoDao;

public class ExemploMercado {

	public static void main(String[] args) {
		
		//Instanciar um MercadoDao
		MercadoDao dao = new MercadoDao();
		
		//Ler os dados do mercado
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do mercado:");
		String nome = leitor.nextLine();
		
		System.out.println("Digite o endereço:");
		String end = leitor.nextLine();
		
		System.out.println("Digite o CNPJ:");
		long cnpj = leitor.nextLong();
		
		System.out.println("Digite a qtd de unidades:");
		int qtd = leitor.nextInt();
		
		//Instanciar um Mercado com os dados lidos
		Mercado mercado = new Mercado(nome, end, cnpj, qtd);
		
		try {
			//Chamar o método cadastrar do Dao, passando o objeto mercado
			dao.cadastrar(mercado);
			System.out.println("Mercado cadastrado!");
		}catch(IOException e) {
			System.out.println("Erro ao cadastrar...");
			e.printStackTrace();
		}
		
	}//main
	
}//classe
