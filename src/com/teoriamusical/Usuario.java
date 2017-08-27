package com.teoriamusical;

public class Usuario extends Pessoa implements AcoesUsuario{
	private String login;
	private String email;
	private String senha;
	private boolean status;
	private boolean assinante;
	private boolean cadastro;
	
	//Metodo construtor
	public Usuario(String nome, int idade, int cpf, String login, String email, String senha) {
		super(nome, idade, cpf);
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.status = false;
		this.assinante = false;
		this.cadastro = false;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", email=" + email + ", senha=" + senha + ", status=" + status
				+ ", assinante=" + assinante + ",cadastro=" + cadastro + ", nome=" + super.nome + ", idade=" + super.idade + ", cpf=" + super.cpf
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
	public void fazCadastro() {
		if(this.cadastro) {
			System.out.println("Usuario ja Cadastrado!");
		}else {
			this.setCadastro(true);
			System.out.println("Cadastro Realizado com Sucesso!");
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

	@Override
	public void acessarPerfil() {
		Perfil perfil = new Perfil();
		perfil.perfilUsuario(this);
		
	}
	
	//Metodos de Acessos
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getAssinante() {
		return assinante;
	}

	public void setAssinante(boolean assinante) {
		this.assinante = assinante;
	}

	public boolean getCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}
	
}
