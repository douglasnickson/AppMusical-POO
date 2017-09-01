package com.teoriamusical;

import com.teoriamusical.app.Aplicativo;
import com.teoriamusical.app.Gerenciamento;
import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public class Main {

	public static void main(String[] args) {
		
		//Criando Usuarios
		Usuario usuario[] = new Usuario[5];
		usuario[0] = new Usuario("Douglas", 25, "12345", "douglas", "douglas@gmail.com", "12345");
		
		//Criando Administradores
		Administrador admin[] = new Administrador[5];
		admin[0] = new Administrador("Nickson", "dnick", "nickson@admin.com", "123545");
		admin[1] = new Administrador("Elen", "evitoria", "elenvitoria@email.com", "123456");
		
		//Instanciando as Interfaces
		Aplicativo app = new Aplicativo();
		Gerenciamento gerenciamento = new Gerenciamento();
		
		//Abrindo a Interface do APP
		System.out.println("-------------------------------");
		System.out.println("       Bem Vindo ao App        ");
		System.out.println("-------------------------------");
		
		admin[0].fazCadastro(gerenciamento);
		admin[0].fazLogin();
		
		//Se o Administrador nao fez login mostra a msg
		if(admin[0].getStatus()) {
			System.out.println("Voce Pode:");
			System.out.println("Cadastrar Modulo, Exercicio ou Assunto");
			
			gerenciamento.cadastrarModulo(admin[0], "Modulo 1 - Basico", true, false);
			gerenciamento.cadastroAdministrador(admin[0], admin[1]);
			gerenciamento.listarUsuario();
			gerenciamento.listarAdministrador();
			
			System.out.println("-------------------------------");
		}else {
			System.out.println("Somente Acesso Autorizado!");
			System.out.println("-------------------------------");
		}	
		
		usuario[0].fazCadastro(gerenciamento);
		usuario[0].fazLogin();
		
		//Area Principal do App
		if(usuario[0].getStatus()){
			app.mostrarModulo(gerenciamento);
			System.out.println("-------------------------------");
		}else {
			System.out.println("Por Favor, Faca o cadastro!");
			System.out.println("ou, faca o Login!");
			System.out.println("-------------------------------");
		}	
		
	}

}
