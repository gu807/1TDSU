package br.com.fiap.view;

import java.io.IOException;
import java.util.List;
import br.com.fiap.bean.Mercado;
import br.com.fiap.dao.MercadoDao;

public class ExemploMercadoListagem {

	public static void main(String[] args) {
		//Instanciar o MercadoDao
		MercadoDao dao = new MercadoDao();
		
		try { 
			//Chamar o método de listar
			List<Mercado> lista = dao.listar();
			
			//Exibir todos os mercados cadastrados!
			for (Mercado m : lista) {
				System.out.println(m);
			}
			
		}catch(IOException e) {
			System.out.println("Erro ao ler o arquivo");
			e.printStackTrace();
		}
		
	}//main
	
}//classe
