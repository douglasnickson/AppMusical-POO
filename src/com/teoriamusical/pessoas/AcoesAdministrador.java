package com.teoriamusical.pessoas;

public interface AcoesAdministrador {
	public abstract void cadastraModulo(int index, String nome, boolean ativo, boolean premium);
	public abstract void cadastraLicao();
	public abstract void cadastraExercicio();
	public abstract void alteraTipoUsuario();
}