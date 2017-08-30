package com.teoriamusical;

import com.teoriamusical.app.Aplicativo;
import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public class Main {

	public static void main(String[] args) {
		
		//Criando Usuarios
		Usuario usuario[] = new Usuario[5];
		usuario[0] = new Usuario("Douglas", 25, "12345", "douglas", "douglas@gmail.com", "12345", 1);
		
		//Criando Administradores
		Administrador admin[] = new Administrador[5];
		admin[0] = new Administrador("Nickson", "dnick", "nickson@admin.com", "123545");
		
		System.out.println("-------------------------------");
		System.out.println("       Bem Vindo ao App        ");
		System.out.println("-------------------------------");
		
		if(usuario[0].getStatus() == false) {
			System.out.println("Por Favor, Faca o cadastro!");
			System.out.println("Caso ja tenha conta, faca o Login!");
			System.out.println("-------------------------------");
			usuario[0].fazCadastro();
			usuario[0].fazLogin();
			System.out.println("-------------------------------");
		}
		
		if(usuario[0].getStatus()){
			Aplicativo app = new Aplicativo();
			app.cadastrarModulo(usuario[0], "Basico 1", true, false);
			app.mostrarModulo();
		}
		
	}

}
