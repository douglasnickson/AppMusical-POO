package com.teoriamusical.app;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public class Aplicativo implements AcoesAplicativo{
	private Usuario usuario[] = new Usuario[10];
	private Administrador admin[] = new Administrador[10];
	
	@Override
	public void mostrarModulo(Gerenciamento gerenciamento) {
		gerenciamento.listarModulos();
	}

	@Override
	public void mostrarAssunto() {
		System.out.println("Listando os assuntos dos modulos....");
		
	}

	@Override
	public void mostrarExercicio() {
		System.out.println("Listando os exercicios do assunto.......");
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
	public void cadastrarModulo(Usuario usuario, String nome, boolean ativo, boolean premium) {
		
	}

	@Override
	public void cadastrarAssunto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarExercicio() {
		// TODO Auto-generated method stub
		
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
	
	//Armazena os Usuarios no App
	@Override
	public void armazenarUsuario(Usuario usuario) {
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

	//Armazena os Administradores no App
	@Override
	public void armazenarAdministrador(Administrador admin) {
		int tam = this.admin.length;
		for(int i = 0; i < this.admin.length; i++) {
			if(this.admin[i] == null) {
				this.admin[i] = admin;
				break;
			}else if(i == tam - 1 && this.admin[i] != null){
				System.out.println("Numero Maximo de Usuarios Atingidos.");
			}
		}
		
	}

}
