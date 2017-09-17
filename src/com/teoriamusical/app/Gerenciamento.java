package com.teoriamusical.app;

import java.util.ArrayList;

import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Aluno;

public class Gerenciamento implements AcoesGerenciamento{
	
	private ArrayList<Modulo> modulo = new ArrayList<>();
	private ArrayList<Assunto> assunto = new ArrayList<>();
	private ArrayList<Exercicio> exercicio = new ArrayList<>();
	private ArrayList<Aluno> aluno = new ArrayList<>();
	private ArrayList<Administrador> admin = new ArrayList<>();
	
	//Faz o cadastro de um modulo no App
	@Override
	public void cadastrarModulo(Administrador admin, Modulo modulo) {
		if(admin.getTipoUsuario() == 1) {
			this.modulo.add(modulo);
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Modulos");
		}

	}

	@Override
	public void listarModulos() {
		System.out.println("Listando os modulos do curso....");
		int index = 0;
		for (Modulo i: modulo) {
			System.out.println("[" + index + "] "  + i.getNome());
			index += 1;
		}
		System.out.println("----------------------------------------");
	}
	
	@Override
	public Modulo buscarModulo(int index) {
		return this.modulo.get(index);
	}
	
	@Override
	public void cadastrarAssunto(Administrador admin, Modulo modulo, Assunto assunto) {
		if(admin.getTipoUsuario() == 1) {
			this.assunto.add(assunto);
			modulo.cadastrarAssunto(assunto);
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Assuntos!");
		}
	}
	
	@Override
	public void listarAssunto() {
		System.out.println("Listando os Assuntos do curso....");
		for (Assunto i: assunto) {
			i.getNome();
		}
		
	}

	@Override
	public void cadastrarExercicio(Administrador admin, Assunto assunto, Exercicio exercicio) {
		if(admin.getTipoUsuario() == 1) {
			this.exercicio.add(exercicio);
			assunto.cadastrarExercicio(exercicio);
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Exercicios!");
		}
		
	}
	
	@Override
	public void listarExercicio() {
		System.out.println("Listando os Exercicios do curso....");
		for (Exercicio i: exercicio) {
			i.getNome();
		}		
	}
	
	//Altera o Tipo do Usuario para Gratis ou Premium
	@Override
	public void alterarTipoUsuario(Administrador administrador, Aluno aluno) {
		int tipo = administrador.getTipoUsuario();
		if(tipo == 1) {
			aluno.setTipoUsuario(2);
			System.out.println("Assinatura Alterada com Sucesso!");
		}else {
			System.out.println("Apenas Administradores podem alterar o Tipo de Usuario.");
		}

	}

	//Cadastra um novo administrador no App
	@Override
	public void cadastroAdministrador(Administrador admin, Administrador novoadmin) {
		if(admin.getTipoUsuario() == 1) {
			this.admin.add(novoadmin);
		}else {
			System.out.println("Apenas um Administrador pode Cadastrar outro!");
		}
	}
	
	//Cadastra o Primeiro Administrador no App
	public void cadastroAdministrador(Administrador admin) {
		if(this.admin.isEmpty()) {
			this.admin.add(admin);
		}else {
			System.out.println("E necessario outro administrador!");
		}
	}
	
	//Lista Todos os Administradores do App
	@Override
	public void listarAdministrador() {
		for (Administrador i: admin) {
			i.getNome();
		}
		
	}
	
	//Armazena os Usuarios no App
	@Override
	public void cadastroUsuario(Aluno aluno) {
		this.aluno.add(aluno);
	}
	
	@Override
	public void listarUsuario() {
		int index = 0;
		for(Aluno i: aluno) {
			System.out.println("[" + index + "] "  + i.getNome());
			index += 1;
		}

	}
}
