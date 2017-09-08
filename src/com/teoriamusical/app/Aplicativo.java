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
	public void acessarAssunto() {
		modulo.mostrarExercicios(0);
		
	}

	@Override
	public void fazerExercicio() {
		modulo.fazerExercicio(0, 0);
		modulo.fazerExercicio(0, 1);
		modulo.atualizarProgressoAssunto(0);
		modulo.atualizarProgresso();
	}
	
	@Override
	public void fazerComentario() {
		modulo.fazerComentario(0, 0, "Muito Bom!");
	}
	
	@Override
	public void fazerAvaliacao() {
		modulo.fazerAvaliacao(0, 0, 5);
	}
	
	@Override
	public void assinarPremium() {
		this.aluno.setTipoUsuario(2);
	}
	
	@Override
	public void gerarCertificado() {
		if(this.aluno.getTipoUsuario() == 2) {
			if(modulo.getConcluido()) {
				System.out.println("Aluno: " + this.aluno.getNome());
				System.out.println("Concluiu o: " + this.modulo.getNome());
				System.out.print("Com os seguintes assuntos: ");
				modulo.mostrarAssuntos();	
			}else {
				System.out.println("Voce deve concluir o modulo antes!");
			}
		}else {
			System.out.println("Apenas Assinantes podem Gerar Certificado!");
		}
	}

}
