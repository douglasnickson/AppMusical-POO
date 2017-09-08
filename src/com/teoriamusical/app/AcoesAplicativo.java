package com.teoriamusical.app;

import com.teoriamusical.pessoas.Aluno;
import com.teoriamusical.pessoas.Usuario;

public interface AcoesAplicativo {
	public void mostrarModulo(Gerenciamento gerenciamento);
	public void acessarModulo();
	public void mostrarAssunto(Gerenciamento gerenciamento);
	public void acessarAssunto();
	public void mostrarExercicio(Gerenciamento gerenciamento);
	public void fazExercicio();
	public void mostrarPerfil(Usuario usuario);
}
