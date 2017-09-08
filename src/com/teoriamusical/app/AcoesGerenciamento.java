package com.teoriamusical.app;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Aluno;

public interface AcoesGerenciamento {

	public abstract void cadastrarModulo(Administrador admin, Modulo modulo);
	public abstract void listarModulos();
	public abstract Modulo buscarModulo(int index);
	public abstract void cadastrarAssunto(Administrador admin, Modulo modulo, Assunto assunto);
	public abstract void listarAssunto();
	public abstract void cadastrarExercicio(Administrador admin, Assunto assunto, Exercicio exercicio);
	public abstract void listarExercicio();
	public abstract void cadastroAdministrador(Administrador admin, Administrador novoadmin);
	public abstract void listarAdministrador();
	public abstract void cadastroUsuario(Aluno aluno);
	public abstract void listarUsuario();
	public abstract void alterarTipoUsuario(Administrador administrador, Aluno aluno);
}
