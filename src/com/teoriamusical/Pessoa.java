package com.teoriamusical;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected int cpf;
	protected String profissao;
	
	public Pessoa(String nome, int idade, int cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.profissao = "Nao Informado";
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
