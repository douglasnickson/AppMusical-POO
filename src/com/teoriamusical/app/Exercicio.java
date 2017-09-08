package com.teoriamusical.app;

public class Exercicio extends Conteudo{
	
	
	public String toStringApp() {
		return "Exercicio [nome=" + nome + ", premium=" + premium + ", ativo=" + ativo + ", concluido="+ super.getConcluido() +"]";
	}
	@Override
	public String toString() {
		return "Exercicio [nome=" + nome + ", concluido="+ super.getConcluido() +"]";
	}
	
	public Exercicio(String nome, boolean ativo, boolean premium) {
		super(nome, ativo, premium);
	}
	
}
