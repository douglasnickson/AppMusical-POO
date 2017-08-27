package com.teoriamusical;

public class Perfil {
	
	public void perfilUsuario(Usuario usuario) {
		System.out.println("------------------------------");
		System.out.println("       DADOS CADASTRADOS      ");
		System.out.println("------------------------------");
		System.out.println("NOME COMPLETO: " + usuario.getNome());
		System.out.println("LOGIN: " + usuario.getLogin());
		System.out.println("EMAIL: " + usuario.getEmail());
		System.out.println("CPF: " + usuario.getCpf());
		System.out.println("IDADE: " + usuario.getIdade());
		System.out.println("PROFISSAO: " + usuario.getProfissao());
		System.out.print("ASSINATURA: ");
		if(usuario.getAssinante()) {
			System.out.println("PREMIUM");
		}else {
			System.out.println("FREE");
		}	
		System.out.println("------------------------------");
	}
	
	public void perfilAdministrador(Administrador admin) {
		System.out.println("------------------------------");
		System.out.println("       DADOS CADASTRADOS      ");
		System.out.println("------------------------------");
		System.out.println("NOME COMPLETO: " + admin.getNome());
		System.out.println("LOGIN: " + admin.getLogin());
		System.out.println("EMAIL: " + admin.getEmail());
		System.out.println("CPF: " + admin.getCpf());
		System.out.println("IDADE: " + admin.getIdade());
		System.out.println("PROFISSAO: " + admin.getProfissao());
		System.out.println("ASSINATURA: ADMINISTRADOR");
		System.out.println("------------------------------");
	}
}
