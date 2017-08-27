package com.teoriamusical;

public class Main {

	public static void main(String[] args) {
		
		//Criando Usuarios
		Usuario usuario[] = new Usuario[5];
		usuario[0] = new Usuario("Douglas", 25, 12345, "douglas", "douglas@gmail.com", "12345");
		
		//Criando Administrador
		Administrador admin[] = new Administrador[2];
		admin[0] = new Administrador("Nickson", 28, 123456, "nickson", "douglas", "douglas@admin.com");
		
		//Listando o Usuario
		System.out.println(usuario[0].toString());
		
		//Listando o Administrador
		System.out.println(admin[0].toString());
		
		//Acoes do Usuario
		usuario[0].fazCadastro();
		usuario[0].fazLogin();
		usuario[0].fazLogout();
		usuario[0].acessarPerfil();
		
		//Acoes do Administrador
		admin[0].fazCadastro();
		admin[0].fazLogin();
		admin[0].fazLogout();
		admin[0].acessarPerfil();
		
		//Se o usuario estiver logado abre a interface do App
		if(usuario[0].getStatus()) {
			Interface app = new Interface();
			app.mostrarModulos();
			app.mostrarAssuntos();
			app.mostrarExercicios();
			app.mostrarPerfil(usuario[0]);	
		}
		
	}

}
