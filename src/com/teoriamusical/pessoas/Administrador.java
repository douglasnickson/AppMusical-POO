package com.teoriamusical.pessoas;

import com.teoriamusical.app.Gerenciamento;

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
		this.tipo = 1;
		this.status = false;
	}
	
	@Override
	public void fazCadastro(Gerenciamento gerenciamento) {
		gerenciamento.cadastroAdministrador(this);
	}
	
	public void fazLogin() {
		this.status = true;
		System.out.println("Login Realizado!");
		System.out.println("Entrando no Gerenciamento....");
		System.out.println("----------------------------------------");
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

	public boolean getCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}
		
}
