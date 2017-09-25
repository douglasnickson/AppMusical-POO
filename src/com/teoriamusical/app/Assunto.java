package com.teoriamusical.app;

import java.util.ArrayList;

public class Assunto extends Conteudo{
	private ArrayList<Exercicio> exercicio = new ArrayList<>();
	
	public Assunto(String nome, boolean ativo, boolean premium) {
		super(nome, ativo, premium);
	}

	@Override
	public String toString() {
		return "Assunto [nome=" + nome + ", progresso=" + progresso + ", avaliacao=" + super.getAvaliacao() + ", concluido=" + super.getConcluido() + ", " + exercicio.toString() + "]";
	}
	

	public void cadastrarExercicio(Exercicio exercicio) {
		this.exercicio.add(exercicio);
	}
	
	//Metodo que lista dos Assuntos
	public void mostrarExercicios() {
		System.out.println("SELECIONE O EXERCICIO");
		System.out.println("----------------------------------------");
		if(exercicio.isEmpty()) {
			System.out.println("Nenhum Exercicio Cadastrado!");
			System.out.println("Digite (-1) para voltar!");
		}else {
			for (int i =0; i<exercicio.size(); i++) {
				System.out.println("["+i+"] " + exercicio.get(i).getNome());
			}
		}
		System.out.println("----------------------------------------");
	}
	
	public void atualizarProgresso() {
		float concluidos = 0;
		float progresso = 0;
		for(Exercicio exercicio: exercicio) {
			if(exercicio.getConcluido()) {
				concluidos += 1;
			}
		}
		
		progresso = (concluidos/exercicio.size())*100;
		this.setProgresso(progresso);
		
		if(progresso == 100) {
			this.setConcluido(true);
		}else {
			this.setConcluido(false);
		}
	}
	
	public void buscarExercicio(int i) {
		exercicio.get(i).setConcluido(true);
	}
	
	public void fazerComentario(int i, String comentario) {
		exercicio.get(i).setComentarios(comentario);
	}
	
	public void fazerAvaliacao(int i, float avaliacao) {
		exercicio.get(i).setAvaliacao(avaliacao);
		int total=0;
		float soma=0;
		float media=0;
		for(Exercicio exercicio: exercicio) {
			soma = soma + exercicio.getAvaliacao();
			total += 1;
		}
		media = soma/total;
		this.setAvaliacao(media);
	}
	
	public boolean verificaConcluido(int exercicio) {
		if(this.exercicio.get(exercicio).getConcluido()) {
			return true;
		}else {
			return false;
		}
	}
}
