package com.teoriamusical;

public class Administrador extends Pessoa{
	private String login;
	private String senha;
	private String email;
	private boolean status;
	private boolean cadastro;
	
	//Metodo construtor
	public Administrador(String nome, int idade, int cpf,  String login, String senha, String email) {
		super(nome, idade, cpf);
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.status = false;
		this.cadastro = false;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Administrador [login=" + login + ", senha=" + senha + ", email=" + email + ", status=" + status
				+ ", cadastro=" + cadastro + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", profissao="
				+ profissao + "]";
	}
		
}
