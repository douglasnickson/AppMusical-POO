package com.teoriamusical.pessoas;

import com.teoriamusical.app.Gerenciamento;

public class Administrador extends Usuario{
	
	public Administrador(String nome, String login, String email, String senha) {
		super(nome, login, email, senha);
		this.tipo_usuario = 1;
		this.status = false;
	}
	
	@Override
	public void fazCadastro(Gerenciamento gerenciamento) {
		gerenciamento.cadastroAdministrador(this);
	}
	
	public void fazLogin() {
		this.status = true;
		System.out.println("Login Realizado!");
		System.out.println("Entrando no Gerenciamento....");
		System.out.println("----------------------------------------");
	}
	
	public void fazLogout() {
		this.status = false;
		System.out.println("Logout Realizado");
	}
		
}
