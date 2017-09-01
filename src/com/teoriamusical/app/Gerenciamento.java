package com.teoriamusical.app;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public class Gerenciamento implements AcoesGerenciamento{
	
	private Modulo modulo[] = new Modulo[10];
	private Assunto assunto[] = new Assunto[10];
	private Exercicio exercicio[] = new Exercicio[10];
	private Usuario usuario[] = new Usuario[10];
	private Administrador admin[] = new Administrador[10];
	
	//Faz o cadastro de um modulo no App
	@Override
	public void cadastrarModulo(Administrador admin, String nome, boolean ativo, boolean premium) {
		//Verifica se o usuario e um administrador
		if(admin.getTipo() == 1) {
			int tam = this.modulo.length;
			for(int i = 0; i < this.modulo.length; i++) {
				
				if(this.modulo[i] == null) {
					this.modulo[i] = new Modulo(nome, ativo, premium);
					System.out.println("Modulo Cadastrado com Sucesso!");
					break;
				}else if (i == tam - 1 && this.modulo[i] != null) {
					System.out.println("Numero Maximo de Modulos Atingido!");
				}
			}
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Modulos");
		}
	}

	@Override
	public void listarModulos() {
		System.out.println("Listando os modulos do curso....");
		for (int i = 0; i < this.modulo.length; i++) {
			if(this.modulo[i] == null) {
				break;
			}else {
				System.out.println(this.modulo[i].getNome_modulo());
			}
		}
		
	}
	
	@Override
	public void cadastrarAssunto() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void listarAssunto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarExercicio() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void listarExercicio() {
		// TODO Auto-generated method stub
		
	}
	
	//Altera o Tipo do Usuario para Gratis ou Premium
	@Override
	public void alterarTipoUsuario(Administrador administrador, Usuario usuario) {
		int tipo = administrador.getTipo();
		if(tipo == 1) {
			usuario.setTipoUsuario(2);
		}else {
			System.out.println("Apenas Administradores podem alterar o Tipo de Usuario.");
		}
	}

	//Cadastra um novo administrador no App
	@Override
	public void cadastroAdministrador(Administrador admin, Administrador novoadmin) {
		int tam = this.admin.length;
		for(int i = 0; i < this.admin.length; i++) {
			if(this.admin[i] == null) {
				this.admin[i] = novoadmin;
				break;
			}else if(i == tam - 1 && this.admin[i] != null){
				System.out.println("Numero Maximo de Usuarios Atingidos.");
			}
		}
		
	}
	
	//Cadastra o Primeiro Administrador no App
	public void cadastroAdministrador(Administrador admin) {
		if(this.admin[0] == null) {
			this.admin[0] = admin;
		}else {
			System.out.println("E necessario que um outro Administrador faca o Cadastro");
		}
		
	}
	
	//Lista Todos os Administradores do App
	@Override
	public void listarAdministrador() {
		System.out.println("Listando os Administradores....");
		for (int i = 0; i < this.admin.length; i++) {
			if(this.admin[i] == null) {
				break;
			}else {
				System.out.println(this.admin[i].getNome());
			}
		}
		
	}
	
	//Armazena os Usuarios no App
	@Override
	public void cadastroUsuario(Usuario usuario) {
		int tam = this.usuario.length;
		for(int i = 0; i < this.usuario.length; i++) {
			if(this.usuario[i] == null) {
				this.usuario[i] = usuario;
				break;
			}else if(i == tam - 1 && this.usuario[i] != null){
				System.out.println("Numero Maximo de Usuarios Atingidos.");
			}
		}
		
	}
	
	@Override
	public void listarUsuario() {
		System.out.println("Listando os Usuarios....");
		for (int i = 0; i < this.usuario.length; i++) {
			if(this.usuario[i] == null) {
				break;
			}else {
				System.out.println(this.usuario[i].getNome());
			}
		}		
	}
}
