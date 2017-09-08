package com.teoriamusical.app;

import java.util.ArrayList;

public class Modulo extends Conteudo{
	private ArrayList<Assunto> assunto = new ArrayList<>();
	
	//Metodo construtor
	public Modulo(String nome, boolean premium, boolean ativo) {
		super(nome, ativo, premium);
	}

	@Override
	public String toString() {
		return "Modulo [nome=" + nome + ", progresso=" + progresso + ", premium=" + premium
				+ ", ativo=" + ativo + ", concluido=" + super.getConcluido() + ", assunto="+ assunto.toString() + "]";
	}

	//Metodos Acessores
	public void cadastrarAssunto(Assunto assunto) {
		this.assunto.add(assunto);
	}
	
	//Metodo que lista dos Assuntos
	public void mostrarAssuntos() {
		for (int i =0; i<assunto.size(); i++) {
			System.out.println(i + " - " + assunto.get(i).getNome());
		}
	}
	
	public void mostrarExercicios(int i) {
		assunto.get(i).mostrarExercicios();
	}
	
	public void fazerExercicio(int i, int l) {
		assunto.get(i).buscarExercicio(l);;
	}
	
	public void atualizarProgressoAssunto(int i) {
		assunto.get(i).atualizarProgresso();
	}
	
	public void atualizarProgresso() {
		float concluidos = 0;
		float progresso = 0;
		for(Assunto assunto: assunto) {
			if(assunto.getConcluido()) {
				concluidos += 1;
			}
		}
		
		progresso = (concluidos/assunto.size())*100;
		this.setProgresso(progresso);
		
		if(progresso == 100) {
			this.setConcluido(true);
		}else {
			this.setConcluido(false);
		}
	}
}
