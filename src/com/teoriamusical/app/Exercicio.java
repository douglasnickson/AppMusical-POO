package com.teoriamusical.app;

public class Exercicio extends Conteudo{
	private String comentarios;
	
	public String toStringApp() {
		return "Exercicio [nome=" + nome + ", premium=" + premium + ", ativo=" + ativo + ", concluido="+ super.getConcluido() +"]";
	}
	
	@Override
	public String toString() {
		return "Exercicio [nome=" + nome + ", concluido="+ super.getConcluido() +", avaliacao=" + super.getAvaliacao() + ", comentario=" + comentarios + "]";
	}
	
	public Exercicio(String nome, boolean ativo, boolean premium) {
		super(nome, ativo, premium);
		this.comentarios = "Sem Comentarios";
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
}
