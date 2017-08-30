package com.teoriamusical.pessoas;

import com.teoriamusical.app.Assunto;
import com.teoriamusical.app.Exercicio;
import com.teoriamusical.app.Modulo;

public class Administrador extends Pessoa implements AcoesAdministrador{
	private String login;
	private String email;
	private String senha;
	
	
	public Administrador(String nome, String login, String email, String senha) {
		super(nome);
		this.login = login;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public void cadastraModulo(int index, String nome, boolean ativo, boolean premium) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastraLicao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastraExercicio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alteraTipoUsuario() {
		// TODO Auto-generated method stub
		
	}

		
}
