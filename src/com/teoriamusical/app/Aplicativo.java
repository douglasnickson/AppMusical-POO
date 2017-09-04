package com.teoriamusical.app;

import com.teoriamusical.pessoas.Usuario;

public class Aplicativo implements AcoesAplicativo{
	
	@Override
	public void mostrarModulo(Gerenciamento gerenciamento) {
		gerenciamento.listarModulos();
	}

	@Override
	public void mostrarAssunto(Gerenciamento gerenciamento) {
		gerenciamento.listarAssunto();
	}

	@Override
	public void mostrarExercicio(Gerenciamento gerenciamento) {
		gerenciamento.listarExercicio();
	}
	
	//Metodo responsavel por listar os dados do usuario
	//Metodo recebe um objetivo usuario e busca informacoes sobre o mesmo
	@Override
	public void mostrarPerfil(Usuario usuario) {
		System.out.println("mostrando o perfil o usuario.....");
		System.out.println("---------------------------------");
		System.out.println("       PERFIL DE " + usuario.getNome().toUpperCase());
		System.out.println("---------------------------------");
		System.out.println("Usuario: " + usuario.getLogin());
		System.out.println("Email: " + usuario.getEmail());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Cpf: " + usuario.getCpf());
		System.out.println("Idade: " + usuario.getIdade());
		System.out.println("Profissao: " + usuario.getProfissao());
		System.out.print("Tipo de Conta: ");
		if(usuario.getTipoUsuario() == 3) {
			System.out.println("Free");
		}else if(usuario.getTipoUsuario() == 2){
			System.out.println("Premium");
		}else {
			System.out.println("Administrador");
		}
		
	}
	
	
	@Override
	public void acessarModulo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acessarAssunto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acessarExercicio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desenhaInterface() {
		System.out.println("-------------------------------------");
	}

}
