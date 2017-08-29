package com.teoriamusical;

import com.teoriamusical.app.Interface;
import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Usuario;

public class Main {

	public static void main(String[] args) {
		
		//Criando Usuarios
		Usuario usuario[] = new Usuario[5];
		usuario[0] = new Usuario("Douglas", 25, 12345, "douglas", "douglas@gmail.com", "12345");
		
		//Criando Administrador
		Administrador admin[] = new Administrador[2];
		admin[0] = new Administrador("Nickson", 28, 123456, "nickson", "douglas", "douglas@admin.com");
		
		//Acoes do Usuario
		usuario[0].fazCadastro();
		usuario[0].fazLogin();
		
		//Acoes do Administrador
		admin[0].fazCadastro();
		admin[0].fazLogin();

		
		//Se o usuario estiver logado abre a interface do App
		if(usuario[0].getStatus()) {
			Interface app = new Interface();
			app.cadastrarModulo(admin[0], 0, "Notas Musicais", true, false);
			app.mostrarModulo();
		}
		
	}

}
