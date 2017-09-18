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
		aluno[1] = new Aluno("Denys", 97, "255548", "denys", "denys@email.com", "12345");
		
		Administrador admin[] = new Administrador[2];
		admin[0] = new Administrador("Nickson", "dnick", "nickson@admin.com", "123545");
		admin[1] = new Administrador("Elen", "evitoria", "elenvitoria@email.com", "123456");
		
		Modulo modulo[] = new Modulo[10];
		modulo[0] = new Modulo("Modulo 1 - Basico", true, false);
		modulo[1] = new Modulo("Modulo 2 - Intermediario", true, false);
		modulo[2] = new Modulo("Modulo 3 - Avancado", true, true);
		
		Assunto assunto[] = new Assunto[10];
		assunto[0] = new Assunto("Notas Musicais", true, false);
		assunto[1] = new Assunto("Acidentes Musicais", true, false);
		assunto[2] = new Assunto("Escalas", true, false);
		assunto[3] = new Assunto("Acordes", true, false);
		assunto[4] = new Assunto("Campo Harmonico", true, true);
		
		Exercicio exercicio[] = new Exercicio[10];
		exercicio[0] = new Exercicio("Quiz", true, false);
		exercicio[1] = new Exercicio("Verdadeiro ou Falso", true, false);
		
		Gerenciamento gerenciamento = new Gerenciamento();
		admin[0].fazCadastro(gerenciamento);
		admin[0].fazLogin();
		
		gerenciamento.cadastrarModulo(admin[0], modulo[0]);
		gerenciamento.cadastrarModulo(admin[0], modulo[1]);
		gerenciamento.cadastrarModulo(admin[0], modulo[2]);
		
		gerenciamento.cadastrarAssunto(admin[0], modulo[0], assunto[0]);
		gerenciamento.cadastrarAssunto(admin[0], modulo[1], assunto[1]);
		gerenciamento.cadastrarAssunto(admin[0], modulo[1], assunto[2]);
		gerenciamento.cadastrarAssunto(admin[0], modulo[2], assunto[3]);
		gerenciamento.cadastrarAssunto(admin[0], modulo[2], assunto[4]);
		
		gerenciamento.cadastrarExercicio(admin[0], assunto[0], exercicio[0]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[0], exercicio[1]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[1], exercicio[0]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[1], exercicio[1]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[2], exercicio[0]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[2], exercicio[1]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[3], exercicio[0]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[3], exercicio[1]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[4], exercicio[0]);
		gerenciamento.cadastrarExercicio(admin[0], assunto[4], exercicio[1]);
		
		
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
		int op2 = -1;
		int op3 = -1;
		int opAluno = -1;
		int opMod = -1;
		int opAss = -1;
		int opExe = -1;
		
		System.out.println("----------------------------------------");
		System.out.println("            BEM VINDO AO APP            ");
		System.out.println("----------------------------------------");
		
		do {
			
			System.out.println("[1] Escolher Usuario");
			System.out.println("[2] Fazer Cadastro");
			System.out.println("[3] Fazer Login");
			System.out.println("[0] Sair");
			System.out.print("Escolha uma Opcao: ");
			op = entrada.nextInt();
			System.out.println("----------------------------------------");
			
			switch (op) {
			case 1:
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
				System.out.println("----------------------------------------");		
				break;
				
			case 2:
				if(opAluno >= 0) {
					aluno[opAluno].fazCadastro(gerenciamento);
				}else {
					System.out.println("Escolha um Usuario para Cadastrar!");
					System.out.println("----------------------------------------");	
				}
				break;
				
			case 3:
				if(opAluno >= 0) {
					aluno[opAluno].fazLogin();
					if(aluno[opAluno].getCadastro()) {
						
						boolean achouModulo = false;
						do {
							gerenciamento.listarModulos();
							System.out.print("Escolha um Modulo: ");
							opMod = entrada.nextInt();
							System.out.println("----------------------------------------");
							
							try {
								gerenciamento.buscarModulo(opMod);
								achouModulo = true;
							} catch (IndexOutOfBoundsException e) {
								System.out.println("Escolha um Modulo Corretamente!");
								System.out.println("----------------------------------------");
							}
							
						}while(achouModulo == false);
						
						Aplicativo app = new Aplicativo(aluno[opAluno], gerenciamento.buscarModulo(opMod));
						do {
							
							System.out.println("[1] Acessar Modulo");
							System.out.println("[2] Mostrar Progresso");
							System.out.println("[3] Mostrar Perfil");
							System.out.println("[4] Assinar Premium");
							System.out.println("[5] Gerar Certificado");
							System.out.println("[6] Escolher Outro Modulo");
							System.out.println("[0] Sair");
							System.out.print("Escolha uma Opcao: ");
							op2 = entrada.nextInt();
							System.out.println("----------------------------------------");
							
							switch (op2) {
							case 1:
								
								app.acessarModulo();

								System.out.print("Escolha Um Assunto: ");
								opAss = entrada.nextInt();
								System.out.println("----------------------------------------");
								
								app.acessarAssunto(opAss);
								System.out.print("Escolha um Exercicio: ");
								opExe = entrada.nextInt();
								
								do {
									
									System.out.println("[1] Fazer Exercicio");
									System.out.println("[2] Fazer Comentario");
									System.out.println("[3] Fazer Avaliacao");
									System.out.println("[0] Sair");
									System.out.print("Escolha uma Opcao: ");
									op3 = entrada.nextInt();
									System.out.println("----------------------------------------");
									
									switch (op3) {
									case 1:
										app.fazerExercicio(opAss, opExe);
										break;
									case 2:
										String comentario;
										System.out.print("Digite o Comentario: ");
										comentario = entrada.next();
										app.fazerComentario(opAss, opExe, comentario);
										System.out.println("----------------------------------------");
										break;
									case 3:
										System.out.print("Digite a Nota: ");
										float avaliacao = entrada.nextFloat();
										app.fazerAvaliacao(opAss, opExe, avaliacao);
										System.out.println("----------------------------------------");
										break;
										
									default:
										break;
									}//Fim terceiro Switch
									
								}while(op3 > 0);
								
								break;
							case 2:
								System.out.println("PROGRESSO DO USUARIO");
								System.out.println(app.toString());
								System.out.println("----------------------------------------");
								break;
							case 3:
								System.out.println("PERFIL DO USUARIO");
								app.mostrarPerfil();
								System.out.println("----------------------------------------");
								break;
							case 4:
								app.assinarPremium();
								System.out.println("----------------------------------------");
								break;
							case 5:
								app.gerarCertificado();
								break;
								
							case 6:
								achouModulo = false;
								do {
									gerenciamento.listarModulos();
									System.out.print("Escolha um Modulo: ");
									opMod = entrada.nextInt();
									System.out.println("----------------------------------------");
									
									try {
										gerenciamento.buscarModulo(opMod);
										achouModulo = true;
									} catch (IndexOutOfBoundsException e) {
										System.out.println("Escolha um Modulo Corretamente!");
										System.out.println("----------------------------------------");
									}
									
								}while(achouModulo == false);
								
								app = new Aplicativo(aluno[opAluno], gerenciamento.buscarModulo(opMod));
								
								break;
								
							default:
								break;
							}//Fecha segundo Switch
							
						}while(op2 > 0);
					}
				}else {
					System.out.println("Escolha um Usuario para Logar!");
					System.out.println("----------------------------------------");	
				}
				break;
				
			default:
				break;
			}//Fecha primeiro Switch

		}while(op > 0);
		
		System.out.println("Ate Mais, Volte Sempre!!!!");
		System.out.println("----------------------------------------");	
	}

}
