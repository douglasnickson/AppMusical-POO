package com.teoriamusical;

public class Main {

	public static void main(String[] args) {
		
		//Criando Usuarios
		Usuario usuario[] = new Usuario[5];
		usuario[0] = new Usuario("Douglas", 25, 12345, "douglas", "douglas@gmail.com", "12345");
		
		//Listando o Usuario
		System.out.println(usuario[0].toString());
		
		//Acoes do Usuario
		usuario[0].fazCadastro();
		usuario[0].fazLogin();
		usuario[0].fazLogout();
		
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
