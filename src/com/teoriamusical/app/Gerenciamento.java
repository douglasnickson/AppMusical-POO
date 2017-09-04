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
	public void cadastrarModulo(Administrador admin, Modulo modulo) {
		System.out.println("         CADASTRAR NOVO MODULO          ");
		System.out.println("----------------------------------------");
		//Verifica se o usuario e um administrador
		if(admin.getTipoUsuario() == 1) {
			int tam = this.modulo.length;
			for(int i = 0; i < this.modulo.length; i++) {
				
				if(this.modulo[i] == null) {
					this.modulo[i] = modulo;
					System.out.println("Modulo Cadastrado com Sucesso!");
					break;
				}else if (i == tam - 1 && this.modulo[i] != null) {
					System.out.println("Numero Maximo de Modulos Atingido!");
				}
			}
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Modulos");
		}
		System.out.println("----------------------------------------");
	}

	@Override
	public void listarModulos() {
		System.out.println("Listando os modulos do curso....");
		for (int i = 0; i < this.modulo.length; i++) {
			if(this.modulo[i] == null) {
				break;
			}else {
				System.out.println(this.modulo[i].getNome());
			}
		}	
	}
	
	@Override
	public void cadastrarAssunto(Administrador admin, Modulo modulo, Assunto assunto) {
		System.out.println("         CADASTRAR NOVO ASSUNTO         ");
		System.out.println("----------------------------------------");
		//Verifica se o usuario e um administrador
		if(admin.getTipoUsuario() == 1) {
			int tam = this.assunto.length;
			for(int i = 0; i < tam; i++) {
				if(this.assunto[i] == null) {
					this.assunto[i] = assunto;
					modulo.cadastrarAssunto(assunto);
					System.out.println("Assunto Cadastrado com Sucesso!");
					break;
				}else if(i == tam - 1 && this.assunto[i] != null) {
					System.out.println("Numero Maximo de Assuntos ja Atingidos!");
				}
			}
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Assuntos!");
		}
		System.out.println("----------------------------------------");
	}
	
	@Override
	public void listarAssunto() {
		System.out.println("Listando os Assuntos do curso....");
		for (int i = 0; i < this.assunto.length; i++) {
			if(this.assunto[i] == null) {
				break;
			}else {
				System.out.println(this.assunto[i].getNome());
			}
		}	
	}

	@Override
	public void cadastrarExercicio(Administrador admin, Assunto assunto, Exercicio exercicio) {
		System.out.println("         CADASTRAR NOVO EXERCICIO         ");
		System.out.println("----------------------------------------");
		//Verifica se o usuario e um administrador
		if(admin.getTipoUsuario() == 1) {
			int tam = this.exercicio.length;
			for(int i = 0; i < tam; i++) {
				if(this.exercicio[i] == null) {
					this.exercicio[i] = exercicio;
					assunto.cadastrarExercicio(exercicio);
					System.out.println("Exercicio Cadastrado com Sucesso!");
					break;
				}else if(i == tam - 1 && this.exercicio[i] != null) {
					System.out.println("Numero Maximo de Exercicios ja Atingidos!");
				}
			}
		}else {
			System.out.println("Apenas Administradores podem Cadastrar Exercicios!");
		}
		System.out.println("----------------------------------------");
		
	}
	
	@Override
	public void listarExercicio() {
		System.out.println("Listando os Exercicios do curso....");
		for (int i = 0; i < this.exercicio.length; i++) {
			if(this.exercicio[i] == null) {
				break;
			}else {
				System.out.println(this.exercicio[i].getNome());
			}
		}		
	}
	
	//Altera o Tipo do Usuario para Gratis ou Premium
	@Override
	public void alterarTipoUsuario(Administrador administrador, Usuario usuario) {
		System.out.println(" ALTERAR O TIPO DE ASSINATURA DO USUARIO");
		System.out.println("----------------------------------------");
		int tipo = administrador.getTipoUsuario();
		if(tipo == 1) {
			usuario.setTipoUsuario(2);
			System.out.println("Assinatura Alterada com Sucesso!");
		}else {
			System.out.println("Apenas Administradores podem alterar o Tipo de Usuario.");
		}
		System.out.println("----------------------------------------");
	}

	//Cadastra um novo administrador no App
	@Override
	public void cadastroAdministrador(Administrador admin, Administrador novoadmin) {
		System.out.println("         CADASTRAR ADMINISTRADOR        ");
		System.out.println("----------------------------------------");
		//Percorre o array em busca de uma posicao vazia
		//Ao encontrar faz o cadastro
		int tam = this.admin.length;
		for(int i = 0; i < this.admin.length; i++) {
			if(this.admin[i] == null) {
				this.admin[i] = novoadmin;
				System.out.println("Novo Administrador Cadastrado com Sucesso!");
				break;
			//Se chegar na ultima posicao e ela nao estiver vazia
			//Entao o limite de usuarios foi atingido
			}else if(i == tam - 1 && this.admin[i] != null){
				System.out.println("Numero Maximo de Usuarios Atingidos.");
			}
		}
		System.out.println("----------------------------------------");
	}
	
	//Cadastra o Primeiro Administrador no App
	public void cadastroAdministrador(Administrador admin) {
		System.out.println("           CONFIGURACAO INICIAL         ");
		System.out.println("----------------------------------------");
		//Verifica se a primeira posicao do Array esta vazia
		//Caso esteja faz o cadastro
		if(this.admin[0] == null) {
			this.admin[0] = admin;
			System.out.println("Administrador Cadastrado com Sucesso!");
		//Se nao estiver significa que o primeiro administrador do app ja foi cadastrado
		//Entao apenas ele e quem pode cadastrar novos administradores
		}else {
			System.out.println("Apenas um Administrador pode Cadastrar outro!");
		}
		System.out.println("----------------------------------------");
	}
	
	//Lista Todos os Administradores do App
	@Override
	public void listarAdministrador() {
		System.out.println("    ADMINISTRADORES CADASTRADOS NO APP  ");
		System.out.println("----------------------------------------");
		for (int i = 0; i < this.admin.length; i++) {
			if(this.admin[i] == null) {
				break;
			}else {
				System.out.println(this.admin[i].getNome());
			}
		}
		System.out.println("----------------------------------------");
	}
	
	//Armazena os Usuarios no App
	@Override
	public void cadastroUsuario(Usuario usuario) {
		System.out.println("        CADASTRAR NOVO USUARIO          ");
		System.out.println("----------------------------------------");
		int tam = this.usuario.length;
		for(int i = 0; i < this.usuario.length; i++) {
			if(this.usuario[i] == null) {
				this.usuario[i] = usuario;
				System.out.println("Cadastro Realizado com Sucesso!");
				break;
			}else if(i == tam - 1 && this.usuario[i] != null){
				System.out.println("Numero Maximo de Usuarios Atingidos.");
			}
		}
		System.out.println("----------------------------------------");
	}
	
	@Override
	public void listarUsuario() {
		System.out.println("        USUARIOS CADASTRADOS NO APP     ");
		System.out.println("----------------------------------------");
		for (int i = 0; i < this.usuario.length; i++) {
			if(this.usuario[i] == null) {
				break;
			}else {
				System.out.println(this.usuario[i].getNome());
			}
		}
		System.out.println("----------------------------------------");

	}
}
