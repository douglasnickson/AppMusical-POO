package com.teoriamusical.pessoas;

import com.teoriamusical.app.Gerenciamento;

public class Administrador extends Usuario{
	
	public Administrador(String nome, String login, String email, String senha) {
		super(nome, login, email, senha);
		this.tipo_usuario = 1;
		this.status = false;
		this.tem_cadastro = true;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Administrador [login=" + login + ", email=" + email + ", senha=" + senha + ", status=" + status
				+ ", tipo_usuario=" + tipo_usuario + ", tem_cadastro=" + tem_cadastro + ", nome=" + nome + "]";
	}

	
	@Override
	public void fazCadastro(Gerenciamento gerenciamento) {
		gerenciamento.cadastroAdministrador(this);
	}


	public void fazLogin() {
		this.status = true;
		System.out.println("Logado com Sucesso!");
		System.out.println("----------------------------------------");
	}
	
	public void fazLogout() {
		this.status = false;
		System.out.println("Logout Realizado");
	}
		
}
