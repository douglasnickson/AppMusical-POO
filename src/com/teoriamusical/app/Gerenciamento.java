package com.teoriamusical.app;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public class Gerenciamento implements AcoesGerenciamento{
	
	private Modulo modulo[] = new Modulo[10];
	private Assunto assunto[] = new Assunto[10];
	private Exercicio exercicio[] = new Exercicio[10];
	
	@Override
	public void cadastrarModulo(Usuario usuario, String nome, boolean ativo, boolean premium) {
		
		if(usuario.getTipoUsuario() == 1) {
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
	public void cadastrarAssunuto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrarExercicio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarTipoUsuario(Administrador administrador, Usuario usuario) {
		int tipo = administrador.getTipo();
		if(tipo == 1) {
			usuario.setTipoUsuario(2);
		}else {
			System.out.println("Apenas Administradores podem alterar o Tipo de Usuario.");
		}
	}

	@Override
	public void cadastroAdministrador(Aplicativo app, Administrador admin) {

	}
}
