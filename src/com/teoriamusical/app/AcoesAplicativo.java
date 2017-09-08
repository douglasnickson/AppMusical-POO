package com.teoriamusical.app;

import com.teoriamusical.pessoas.Aluno;
import com.teoriamusical.pessoas.Usuario;

public interface AcoesAplicativo {
	public void mostrarModulo(Gerenciamento gerenciamento);
	public void acessarModulo();
	public void acessarAssunto();
	public void fazerExercicio();
	public void fazerComentario();
	public void fazerAvaliacao();
	public void mostrarPerfil(Aluno aluno);
}
