package com.teoriamusical.app;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public class Aplicativo implements AcoesAplicativo{
	private Modulo modulo[] = new Modulo[10];
	private Assunto assunto[] = new Assunto[10];
	private Exercicio exercicio[] = new Exercicio[10];
	private Usuario usuario[] = new Usuario[10];
	private Administrador admin[] = new Administrador[10];
	
	@Override
	public void mostrarModulo() {
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
		
		if(usuario.getTipoUsuario() == 1) {
			int tam = this.modulo.length;
			for(int i = 0; i < this.modulo.length; i++) {
				
				if(this.modulo[i] == null) {
					this.modulo[i] = new Modulo(nome, ativo, premium);
					System.out.println("Modulo Cadastrado com Sucesso!");
				}else if (i == tam - 1 && this.modulo[i] != null) {
					System.out.println("Numero Maximo de Modulos Atingido!");
				}
			}
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Modulos");
		}
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

}
