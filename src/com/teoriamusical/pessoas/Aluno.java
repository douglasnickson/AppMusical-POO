package com.teoriamusical.pessoas;

import com.teoriamusical.app.Gerenciamento;

public class Aluno extends Usuario implements AcoesAluno{
	
	//Metodo construtor
	public Aluno(String nome, int idade, String cpf, String login, String email, String senha) {
		super(nome, idade, cpf, login, email, senha);
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", email=" + email + ", senha=" + senha + ", status=" + status
				+ ", assinante=" + tipo_usuario + ",cadastro=" + tem_cadastro + ", nome=" + super.nome + ", idade=" + super.idade + ", cpf=" + super.cpf
				+ ", profissao=" + super.profissao + "]";
	}
	
	//Verifica se o usuario tem cadastro
	//Caso tenha faz login e da um aviso
	//Senao retorna uma mensagem de aviso
	@Override
	public void fazLogin() {
		if(this.getCadastro()) {
			this.setStatus(true);
			System.out.println("Logado com Sucesso!");
			System.out.println("Entrando no App....");
			System.out.println("----------------------------------------");
		}else {
			System.out.println("Faca o Cadastro antes de Logar!");
		}
		
	}

	//faz logout e coloca o status como deslogado
	@Override
	public void fazLogout() {
		this.setStatus(false);
		System.out.println("Deslogado com Sucesso!");
	}
	
	//Verifica se o usuario ja esta cadastrado
	//Senao estiver faz o cadastro
	@Override
	public void fazCadastro(Gerenciamento gerenciamento) {
		if(this.tem_cadastro) {
			System.out.println("Usuario ja Cadastrado!");
		}else {
			this.setCadastro(true);
			gerenciamento.cadastroUsuario(this);
		}
	}

	@Override
	public void acessarModulo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fazExercicio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escolherAssunto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assinarPremium() {
		// TODO Auto-generated method stub
		
	}
	
}
