package com.teoriamusical.app;

import com.teoriamusical.pessoas.Usuario;

public interface Aplicativo {
	public void mostrarModulo();
	public void acessarModulo();
	public void cadastrarModulo(int index, String nome, boolean ativo, boolean premium);
	public void mostrarAssunto();
	public void acessarAssunto();
	public void cadastrarAssunto();
	public void mostrarExercicio();
	public void acessarExercicio();
	public void cadastrarExercicio();
	public void mostrarPerfil(Usuario usuario);
}