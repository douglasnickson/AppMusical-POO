package com.teoriamusical.app;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public interface AcoesGerenciamento {

	public abstract void cadastrarModulo(Usuario usuario, String nome, boolean ativo, boolean premium);
	public abstract void cadastrarAssunuto();
	public abstract void cadastrarExercicio();
	public abstract void alterarTipoUsuario(Administrador administrador, Usuario usuario);
	public abstract void listarModulos();
	public abstract void cadastroAdministrador(Aplicativo app, Administrador admin);

}
