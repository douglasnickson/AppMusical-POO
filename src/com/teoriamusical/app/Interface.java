package com.teoriamusical.app;

import com.teoriamusical.pessoas.Usuario;

public class Interface implements Aplicativo{
	private Modulo modulo[] = new Modulo[10];
	private Assunto assunto[] = new Assunto[10];
	private Exercicio exercicio[] = new Exercicio[10];
	
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
	public void cadastrarModulo(int index, String nome, boolean ativo, boolean premium) {
		if(index < 10 && this.modulo[index] == null) {
			this.modulo[index] = new Modulo(nome, ativo, premium);
			System.out.println("Modulo Cadastrado com Sucesso!");
		}else {
			System.out.println("Numero Maximo de Modulos Atingido!");
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
