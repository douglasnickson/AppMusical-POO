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
		return "Aplicativo [Aluno=" + aluno.getLogin() + ", Modulo=" + modulo.getNome() + ", Progresso=" + modulo.getProgresso() + ", Avaliacao=" + modulo.getAvaliacao() + ", " + modulo.getAssunto() +"]";
	}


	@Override
	public void mostrarModulo(Gerenciamento gerenciamento) {
		gerenciamento.listarModulos();
	}
	
	@Override
	public void mostrarPerfil() {
		System.out.println(this.aluno.toString());
		
	}
	
	@Override
	public void acessarModulo() {
		modulo.mostrarAssuntos();	
	}

	@Override
	public void acessarAssunto(int i) {
		modulo.mostrarExercicios(i);
		
	}

	@Override
	public void fazerExercicio(int assunto, int exercicio) {
		modulo.fazerExercicio(assunto, exercicio);
		modulo.atualizarProgressoAssunto(assunto);
		modulo.atualizarProgresso();
	}
	
	@Override
	public void fazerComentario(int assunto, int exercicio, String comentario) {
		modulo.fazerComentario(assunto, exercicio, comentario);
	}
	
	@Override
	public void fazerAvaliacao(int assunto, int exercicio, float nota) {
		modulo.fazerAvaliacao(assunto, exercicio, nota);
	}
	
	@Override
	public void assinarPremium() {
		this.aluno.setTipoUsuario(2);
		System.out.println("Premium Assinado com Sucesso!");
	}
	
	@Override
	public void gerarCertificado() {
		if(this.aluno.getTipoUsuario() == 2) {
			if(modulo.getConcluido()) {
				System.out.println("CERTIFICADO GERADO COM SUCESSO!");
				System.out.println("Aluno: " + this.aluno.getNome());
				System.out.println("Concluiu o: " + this.modulo.getNome());
				System.out.print("Com os seguintes assuntos: ");
				modulo.mostrarAssuntos();	
			}else {
				System.out.println("Voce deve concluir o modulo antes!");
				System.out.println("----------------------------------------");
			}
		}else {
			System.out.println("Apenas Assinantes podem Gerar Certificado!");
			System.out.println("----------------------------------------");
		}
	}
	
	public boolean verificaConcluido(int assunto, int exercicio) {
			if(this.modulo.verificaConcluido(assunto, exercicio)) {
				return true;
			}else {
				return false;
			}
	}

}
