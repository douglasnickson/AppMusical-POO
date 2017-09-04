package com.teoriamusical.app;

public class Exercicio extends Conteudo{
	private String tipo_exercicio;

	public void setTipo_exercicio(String tipo_exercicio) {
		this.tipo_exercicio = tipo_exercicio;
	}
	
	public Exercicio(String nome, boolean ativo, boolean premium) {
		super(nome, ativo, premium);
		// TODO Auto-generated constructor stub
	}

	public String getTipo_exercicio() {
		return tipo_exercicio;
	}

}
