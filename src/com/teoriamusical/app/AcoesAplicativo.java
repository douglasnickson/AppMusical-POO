package com.teoriamusical.app;

import com.teoriamusical.pessoas.Aluno;

public interface AcoesAplicativo {
	public void mostrarModulo(Gerenciamento gerenciamento);
	public void acessarModulo();
	public void acessarAssunto(int assunto);
	public void fazerExercicio(int assunto, int exercicio);
	public void fazerComentario(int assunto, int exercicio, String comentario);
	public void fazerAvaliacao(int assunto, int exercicio, float nota);
	public void mostrarPerfil();
	public void gerarCertificado();
	public void assinarPremium();
}
