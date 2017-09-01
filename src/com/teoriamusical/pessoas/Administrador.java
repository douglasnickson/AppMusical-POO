package com.teoriamusical.pessoas;

import com.teoriamusical.app.Aplicativo;

public class Administrador extends Pessoa implements AcoesAdministrador{
	private String login;
	private String email;
	private String senha;
	private boolean status;
	private boolean cadastro;
	private int tipo;
	
	public Administrador(String nome, String login, String email, String senha) {
		super(nome);
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.status = false;
	}
	
	//Verifica se o usuario ja esta cadastrado
	//Senao estiver faz o cadastro
	@Override
	public void fazCadastro(Aplicativo app) {
		if(this.cadastro) {
			System.out.println("Administrador ja Cadastrado!");
		}else {
			this.setCadastro(true);
			app.armazenarAdministrador(this);
			System.out.println("Cadastro Realizado com Sucesso!");
		}
	}
	
	public void fazLogin() {
		this.status = true;
		System.out.println("Login Realizado!");
		System.out.println("Entrando no Gerenciamento....");
	}
	
	public void fazLogout() {
		this.status = false;
		System.out.println("Logout Realizado");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}
	
	
		
}
