package com.teoriamusical.app;

import java.util.ArrayList;

public class Modulo extends Conteudo{
	private ArrayList<Assunto> assunto = new ArrayList<>();
	
	//Metodo construtor
	public Modulo(String nome, boolean premium, boolean ativo) {
		super(nome, ativo, premium);
	}

	//Metodos Acessores
	public void cadastrarAssunto(Assunto assunto) {
		this.assunto.add(assunto);
	}
	
	//Metodo que lista dos Assuntos
	public void mostrarAssuntos() {
		for (int i =0; i<assunto.size(); i++) {
			System.out.println(assunto.get(i).getNome());
		}
	}
}
