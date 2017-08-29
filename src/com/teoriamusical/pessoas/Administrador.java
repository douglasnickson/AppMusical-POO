package com.teoriamusical.pessoas;

import com.teoriamusical.app.Assunto;
import com.teoriamusical.app.Exercicio;
import com.teoriamusical.app.Interface;
import com.teoriamusical.app.Modulo;

public class Administrador extends Usuario implements AcoesAdministrador{

	
	//Metodo construtor
	public Administrador(String nome, int idade, int cpf,  String login, String email, String senha) {
		super(nome, idade, cpf, login, email, senha);
	}
	
	//Verifica se o usuario tem cadastro
	//Caso tenha faz login e da um aviso
	//Senao retorna uma mensagem de aviso
	@Override
	public void fazLogin() {
		if(this.getCadastro()) {
			this.setStatus(true);
			System.out.println("Entrando na area Administrativa");
		}else {
			System.out.println("Faca o Cadastro antes de Logar!");
		}
		
	}

	//faz logout e coloca o status como deslogado
	@Override
	public void fazLogout() {
		this.setStatus(false);
		System.out.println("Saindo da area Administrativa");
	}
	
	//Verifica se o usuario ja esta cadastrado
	//Senao estiver faz o cadastro
	@Override
	public void fazCadastro() {
		if(this.cadastro) {
			System.out.println("Administrador ja Cadastrado!");
		}else {
			this.setCadastro(true);
			System.out.println("Cadastro Realizado com Sucesso!");
		}
	}
	
	//Esse metodo faz os cadastros dos modulos do app
	@Override
	public void cadastraModulo(int index, String nome, boolean ativo, boolean premium) {
		Interface app = new Interface();
		app.cadastrarModulo(index, nome, ativo, premium);
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
