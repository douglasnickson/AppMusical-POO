package com.teoriamusical;

import com.teoriamusical.app.Aplicativo;
import com.teoriamusical.app.Assunto;
import com.teoriamusical.app.Exercicio;
import com.teoriamusical.app.Gerenciamento;
import com.teoriamusical.app.Modulo;
import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Aluno;

public class Main {

	public static void main(String[] args) {
		
		//Criando Usuarios
		Aluno aluno[] = new Aluno[5];
		aluno[0] = new Aluno("Douglas", 25, "12345", "douglas", "douglas@gmail.com", "12345");
		
		//Criando Administradores
		Administrador admin[] = new Administrador[5];
		admin[0] = new Administrador("Nickson", "dnick", "nickson@admin.com", "123545");
		admin[1] = new Administrador("Elen", "evitoria", "elenvitoria@email.com", "123456");
		
		//Criando os Modulos
		Modulo modulo[] = new Modulo[10];
		modulo[0] = new Modulo("Modulo 1 - Basico", true, false);
		
		//Criando os Assuntos
		Assunto assunto[] = new Assunto[10];
		assunto[0] = new Assunto("Notas Musicais", false, true);
		
		//Criando os Exercicios
		Exercicio exercicio[] = new Exercicio[10];
		exercicio[0] = new Exercicio("Quiz", true, false);
		
		//Instanciando as Interfaces
		Aplicativo app = new Aplicativo();
		Gerenciamento gerenciamento = new Gerenciamento();
		
		//Abrindo a Interface do APP
		System.out.println("----------------------------------------");
		System.out.println("            BEM VINDO AO APP            ");
		System.out.println("----------------------------------------");
		
		//Cadastro e Login
		admin[0].fazCadastro(gerenciamento);
		admin[0].fazLogin();
		aluno[0].fazCadastro(gerenciamento);
		aluno[0].fazLogin();
		
		//Se o Administrador nao fez login mostra a msg
		if(admin[0].getStatus()) {
			System.out.println("----------------------------------------");
			System.out.println("      BEM VINDO AO GERENCIMAMENTO       ");
			System.out.println("----------------------------------------");
			gerenciamento.cadastrarModulo(admin[0], modulo[0]);
			gerenciamento.cadastrarAssunto(admin[0], modulo[0], assunto[0]);
			gerenciamento.cadastrarExercicio(admin[0], assunto[0], exercicio[0]);
			gerenciamento.cadastroAdministrador(admin[0], admin[1]);
			//gerenciamento.listarUsuario();
			//gerenciamento.listarAdministrador();
		}else {
			System.out.println("Somente Acesso Autorizado!");
			System.out.println("----------------------------------------");
		}	

		
		//Area Principal do App
		if(aluno[0].getStatus()){
			System.out.println("----------------------------------------");
			System.out.println("     BEM VINDO A INTERFACE DO APP       ");
			System.out.println("----------------------------------------");
			
			
			app.mostrarModulo(gerenciamento);
			System.out.println("----------------------------------------");
			//app.mostrarAssunto(gerenciamento);
			//System.out.println("----------------------------------------");
			//app.mostrarExercicio(gerenciamento);
			
			aluno[0].acessarModulo(modulo[0]);
			aluno[0].acessarAssunto(assunto[0]);
			aluno[0].fazExercicio(exercicio[0]);
			
		}else {
			System.out.println("Por Favor, Faca o cadastro!");
			System.out.println("ou, faca o Login!");
			System.out.println("----------------------------------------");
		}	
		
	}

}
