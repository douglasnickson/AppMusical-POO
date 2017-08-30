package com.teoriamusical.app;

import com.teoriamusical.pessoas.Usuario;

public interface AcoesAplicativo {
	public void mostrarModulo();
	public void acessarModulo();
	public void cadastrarModulo(Usuario usuario, String nome, boolean ativo, boolean premium);
	public void mostrarAssunto();
	public void acessarAssunto();
	public void cadastrarAssunto();
	public void mostrarExercicio();
	public void acessarExercicio();
	public void cadastrarExercicio();
	public void mostrarPerfil(Usuario usuario);
}
