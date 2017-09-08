package com.teoriamusical.app;

import java.util.ArrayList;

public class Assunto extends Conteudo{
	private ArrayList<Exercicio> exercicio = new ArrayList<>();
	
	public Assunto(String nome, boolean premium, boolean ativo) {
		super(nome, ativo, premium);
	}

	@Override
	public String toString() {
		return "Assunto [nome=" + nome + ", progresso=" + progresso + ", concluido=" + super.getConcluido() + ", " + exercicio.toString() + "]";
	}
	

	public void cadastrarExercicio(Exercicio exercicio) {
		this.exercicio.add(exercicio);
	}
	
	//Metodo que lista dos Assuntos
	public void mostrarExercicios() {
		for (int i =0; i<exercicio.size(); i++) {
			System.out.println(i + " - " + exercicio.get(i).getNome());
		}
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
}
