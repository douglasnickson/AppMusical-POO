package com.teoriamusical.app;

import com.teoriamusical.pessoas.Aluno;

public class Aplicativo implements AcoesAplicativo{
	
	private Aluno aluno;
	private Modulo modulo;
	
	public Aplicativo(Aluno aluno, Modulo modulo) {
		super();
		this.aluno = aluno;
		this.modulo = modulo;
	}
	

	@Override
	public String toString() {
		return "Aplicativo [Aluno=" + aluno.getLogin() + ", Modulo=" + modulo.getNome() + ", Progresso=" + modulo.getProgresso() + ", " + modulo.getAssunto() +"]";
	}


	@Override
	public void mostrarModulo(Gerenciamento gerenciamento) {
		gerenciamento.listarModulos();
	}
	
	@Override
	public void mostrarPerfil(Aluno aluno) {
		aluno.toString();
		
	}
	
	@Override
	public void acessarModulo() {
		modulo.mostrarAssuntos();	
	}

	@Override
	public void acessarAssunto() {
		modulo.mostrarExercicios(0);
		
	}

	@Override
	public void fazExercicio() {
		modulo.fazerExercicio(0, 0);
		modulo.fazerExercicio(0, 1);
		modulo.atualizarProgressoAssunto(0);
		modulo.atualizarProgresso();
	}
	
	public void fazerComentario() {
		modulo.fazerComentario(0, 0, "Muito Bom!");
	}

}
