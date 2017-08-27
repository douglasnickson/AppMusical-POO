package com.teoriamusical;

public class Interface implements Aplicativo{

	@Override
	public void mostrarModulos() {
		System.out.println("Listando os modulos do curso....");
		
	}

	@Override
	public void mostrarAssuntos() {
		System.out.println("Listando os assuntos dos modulos....");
		
	}

	@Override
	public void mostrarExercicios() {
		System.out.println("Listando os exercicios do assunto.......");
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
		System.out.print("Assinatura: ");
		if(usuario.getAssinante()) {
			System.out.println("Premium");
		}else {
			System.out.println("Free");
		}
		
	}

}
