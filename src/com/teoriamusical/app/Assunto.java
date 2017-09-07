package com.teoriamusical.app;

import java.util.ArrayList;

public class Assunto extends Conteudo{
	private ArrayList<Exercicio> exercicio = new ArrayList<>();
	
	public Assunto(String nome, boolean premium, boolean ativo) {
		super(nome, ativo, premium);
	}
	
	public void cadastrarExercicio(Exercicio exercicio) {
		this.exercicio.add(exercicio);
	}
	
	//Metodo que lista dos Assuntos
	public void mostrarExercicios() {
		for (int i =0; i<exercicio.size(); i++) {
			System.out.println(exercicio.get(i).getNome());
		}
	}
}
