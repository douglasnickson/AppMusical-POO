package com.teoriamusical.pessoas;

import com.teoriamusical.app.Aplicativo;
import com.teoriamusical.app.Gerenciamento;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String cpf;
	protected String sexo;
	protected String profissao;
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.cpf = "Nao Informado";
		this.sexo = "Nao Informado";
		this.profissao = "Nao Informado";
	}
	
	public void fazLogin() {
		System.out.println("Login Realizado!");
	}
	
	public void fazLogout() {
		System.out.println("Logout Realizado");
	}

	public void fazCadastro(Gerenciamento gerenciamento) {
		System.out.println("Cadastro Realizado");
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
