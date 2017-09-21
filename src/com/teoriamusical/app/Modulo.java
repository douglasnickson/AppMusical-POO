package com.teoriamusical.app;

import java.util.ArrayList;

public class Modulo extends Conteudo{
	private ArrayList<Assunto> assunto = new ArrayList<>();
	
	//Metodo construtor
	public Modulo(String nome, boolean ativo, boolean premium) {
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
		System.out.println("SELECIONE O ASSUNTO");
		System.out.println("----------------------------------------");
		for (int i =0; i<assunto.size(); i++) {
			System.out.println("["+i+"] " + assunto.get(i).getNome());
		}
		System.out.println("----------------------------------------");
	}
	
	public void mostrarExercicios(int i) {
		assunto.get(i).mostrarExercicios();
	}
	
	public void fazerExercicio(int i, int l) {
		assunto.get(i).buscarExercicio(l);
	}
	
	public void fazerComentario(int i, int l, String comentario) {
		assunto.get(i).fazerComentario(l, comentario);
	}
	
	public void fazerAvaliacao(int i, int l, float avaliacao) {
		assunto.get(i).fazerAvaliacao(l, avaliacao);
		int total=0;
		float soma=0;
		float media=0;
		for(Assunto assunto: assunto) {
			soma = soma + assunto.getAvaliacao();
			total += 1;
		}
		media = soma/total;
		this.setAvaliacao(media);
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
	
	public boolean verificaConcluido(int assunto, int exercicio) {
		if(this.assunto.get(assunto).verificaConcluido(exercicio)) {
			return true;
		}else {
			return false;
		}
	}
	public ArrayList<Assunto> getAssunto() {
		return assunto;
	}

	public void setAssunto(ArrayList<Assunto> assunto) {
		this.assunto = assunto;
	}
	
	
}
