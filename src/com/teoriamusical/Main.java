package com.teoriamusical;

import java.util.Scanner;

import com.teoriamusical.app.Aplicativo;
import com.teoriamusical.app.Assunto;
import com.teoriamusical.app.Exercicio;
import com.teoriamusical.app.Gerenciamento;
import com.teoriamusical.app.Modulo;
import com.teoriamusical.pessoas.Administrador;
import com.teoriamusical.pessoas.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno[] = new Aluno[5];
		aluno[0] = new Aluno("Douglas", 25, "12345", "douglas", "douglas@gmail.com", "12345");
		
		Administrador admin[] = new Administrador[2];
		admin[0] = new Administrador("Nickson", "dnick", "nickson@admin.com", "123545");
		admin[1] = new Administrador("Elen", "evitoria", "elenvitoria@email.com", "123456");
		
		Modulo modulo[] = new Modulo[10];
		modulo[0] = new Modulo("Modulo 1 - Basico", true, false);
		
		Assunto assunto[] = new Assunto[10];
		assunto[0] = new Assunto("Notas Musicais", false, true);
		
		Exercicio exercicio[] = new Exercicio[10];
		exercicio[0] = new Exercicio("Quiz", true, false);
		exercicio[1] = new Exercicio("Verdadeiro ou Falso", true, false);
		
		Gerenciamento gerenciamento = new Gerenciamento();
		admin[0].fazCadastro(gerenciamento);
		admin[0].fazLogin();
		gerenciamento.cadastrarModulo(admin[0], modulo[0]);
		gerenciamento.cadastrarAssunto(admin[0], modulo[0], assunto[0]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[0], exercicio[0]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[0], exercicio[1]);
		gerenciamento.cadastroAdministrador(admin[0], admin[1]);
		
		//System.out.println("----------------------------------------");
		//System.out.println("            BEM VINDO AO APP            ");
		//System.out.println("----------------------------------------");
	
		//aluno[0].fazCadastro(gerenciamento);
		//aluno[0].fazLogin();
		
		//gerenciamento.listarModulos();
		
		//Aplicativo app = new Aplicativo(aluno[0], gerenciamento.buscarModulo(0));
		//app.acessarModulo();
		//app.acessarAssunto();
		//app.fazerExercicio();
		//app.fazerComentario();
		//app.fazerAvaliacao();
		//app.assinarPremium();
		//app.gerarCertificado();
		//app.mostrarPerfil();
		//System.out.println(app.toString());
		
		Scanner entrada = new Scanner(System.in);
		int op = -1;
		int opAluno = 0;
		int opMod = 0;
		int opAss = 0;
		
		System.out.println("----------------------------------------");
		System.out.println("            BEM VINDO AO APP            ");
		System.out.println("----------------------------------------");
		
		int index = 0;
		for(Aluno i: aluno) {
			if(i != null) {
				System.out.println("["+ index + "] " +i.getNome());
				index += 1;
			}else{
				break;
			}
		}
				
		System.out.print("Escolha um Usuario: ");
		opAluno = entrada.nextInt();
		
		do {
			System.out.print("[1] Fazer Cadastro [2] Login [-1] Sair: ");
			op = entrada.nextInt();
			
			switch (op) {
			case 1:
				aluno[opAluno].fazCadastro(gerenciamento);
				break;
			case 2:
				aluno[opAluno].fazLogin();
				if(aluno[opAluno].getCadastro()) {
					gerenciamento.listarModulos();
					
					System.out.print("Escolha um Modulo ou -1 Sair: ");
					opMod = entrada.nextInt();
					
					Aplicativo app = new Aplicativo(aluno[opAluno], gerenciamento.buscarModulo(opMod));
					
					System.out.print("Escolha Um Assunto: ");
					app.acessarModulo();
					opAss = entrada.nextInt();
					app.acessarAssunto(opAss);
					
					System.out.print("Escolha um Exercicio: ");
				}
				break;
				
				
			default:
				break;
			}

		}while(op >= 0);
		
	}

}
