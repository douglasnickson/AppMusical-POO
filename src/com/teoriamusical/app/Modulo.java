package com.teoriamusical.app;

import java.util.ArrayList;

public class Modulo {
	private String nome_modulo;
	private float progresso;
	private boolean ativo;
	private boolean premium;
	private ArrayList<Assunto> assunto = new ArrayList<>();
	
	//Metodo construtor
	public Modulo(String nome_modulo, boolean ativo, boolean premium) {
		super();
		this.nome_modulo = nome_modulo;
		this.ativo = ativo;
		this.premium = premium;
		this.progresso = 0;
	}

	//Metodos Acessores
	public String getNome_modulo() {
		return nome_modulo;
	}

	public void setNome_modulo(String nome_modulo) {
		this.nome_modulo = nome_modulo;
	}

	public float getProgresso() {
		return progresso;
	}

	public void setProgresso(float progresso) {
		this.progresso = progresso;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public boolean getPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public ArrayList<Assunto> getAssunto() {
		return assunto;
	}

	public void cadastrarAssunto(Assunto assunto) {
		this.assunto.add(assunto);
	}
	
}
