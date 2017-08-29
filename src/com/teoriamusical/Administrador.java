package com.teoriamusical;

public class Administrador extends Pessoa implements AcoesAdministrador{
	private String login;
	private String senha;
	private String email;
	private boolean status;
	private boolean cadastro;
	private Modulo modulo[] = new Modulo[10];
	private Assunto assunto[] = new Assunto[10];
	private Exercicio exercicio[] = new Exercicio[10];
	
	//Metodo construtor
	public Administrador(String nome, int idade, int cpf,  String login, String senha, String email) {
		super(nome, idade, cpf);
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.status = false;
		this.cadastro = false;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Administrador [login=" + login + ", senha=" + senha + ", email=" + email + ", status=" + status
				+ ", cadastro=" + cadastro + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", profissao="
				+ profissao + "]";
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
		if(index < 10 && modulo[index] == null) {
			modulo[index] = new Modulo(nome, ativo, premium);
		}else {
			System.out.println("Numero Maximo de Modulos Atingido!");
		}
		
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
	
	@Override
	public void acessarPerfil() {
		Perfil perfil = new Perfil();
		perfil.perfilAdministrador(this);
		
	}	

	//Metodos Acessores
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}
		
}
