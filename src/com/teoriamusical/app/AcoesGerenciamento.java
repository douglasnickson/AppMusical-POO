package com.teoriamusical.app;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public interface AcoesGerenciamento {

	public abstract void cadastrarModulo(Administrador admin, Modulo modulo);
	public abstract void listarModulos();
	public abstract void cadastrarAssunto(Administrador admin, Modulo modulo, Assunto assunto);
	public abstract void listarAssunto();
	public abstract void cadastrarExercicio();
	public abstract void listarExercicio();
	public abstract void cadastroAdministrador(Administrador admin, Administrador novoadmin);
	public abstract void listarAdministrador();
	public abstract void cadastroUsuario(Usuario usuario);
	public abstract void listarUsuario();
	public abstract void alterarTipoUsuario(Administrador administrador, Usuario usuario);
}
