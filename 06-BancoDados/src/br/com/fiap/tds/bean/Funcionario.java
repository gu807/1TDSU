package br.com.fiap.tds.bean;

public class Funcionario {

	private int codigo;
	
	private String nome;
	
	private boolean ativo;
	
	private double salario;
	
	private String dataNascimento;
	
	public Funcionario() {}

	public Funcionario(int codigo, String nome, boolean ativo, double salario, String dataNascimento) {
		this.codigo = codigo;
		this.nome = nome;
		this.ativo = ativo;
		this.salario = salario;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return codigo + " " + nome + " " + ativo + " " + salario + " " + dataNascimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
