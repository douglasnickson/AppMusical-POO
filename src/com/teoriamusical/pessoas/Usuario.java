package com.teoriamusical.pessoas;

public abstract class Usuario extends Pessoa{
	protected String login;
	protected String email;
	protected String senha;
	protected boolean status; //Logado ou Nao
	protected int tipo_usuario; //Tipo de Usuario
	protected boolean tem_cadastro; //Cadastrado ou Nao
	
	//Metodo construtor
	public Usuario(String nome, int idade, String cpf, String login, String email, String senha) {
		super(nome);
		this.idade = idade;
		this.cpf = cpf;
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.status = false;
		this.tipo_usuario = 3;
		this.tem_cadastro = false;
	}
	
	public Usuario(String nome, String login, String email, String senha) {
		super(nome);
		this.status = false;
		this.tipo_usuario = 1;
		this.tem_cadastro = false;
	}
	
	//Metodos de Acessos
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

	public int getTipoUsuario() {
		return tipo_usuario;
	}

	public void setTipoUsuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public boolean getCadastro() {
		return tem_cadastro;
	}

	public void setCadastro(boolean tem_cadastro) {
		this.tem_cadastro = tem_cadastro;
	}
	
}
