package com.teoriamusical.app;

public abstract class Conteudo {
	protected String nome;
	protected float progresso;
	protected float avaliacao;
	private boolean concluido;
	protected boolean premium;
	protected boolean ativo;
	
	public Conteudo(String nome, boolean ativo, boolean premium) {
		super();
		this.nome = nome;
		this.progresso = 0;
		this.premium = premium;
		this.ativo = ativo;
		this.avaliacao = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getProgresso() {
		return progresso;
	}
	public void setProgresso(float progresso) {
		this.progresso = progresso;
	}
	public boolean getPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean getConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	
}
