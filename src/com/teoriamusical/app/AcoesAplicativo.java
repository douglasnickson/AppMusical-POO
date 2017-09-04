package com.teoriamusical.app;

import com.teoriamusical.pessoas.Usuario;

public interface AcoesAplicativo {
	public void mostrarModulo(Gerenciamento gerenciamento);
	public void acessarModulo();
	public void mostrarAssunto(Gerenciamento gerenciamento);
	public void acessarAssunto();
	public void mostrarExercicio();
	public void acessarExercicio();
	public void mostrarPerfil(Usuario usuario);
	public void desenhaInterface();
}
