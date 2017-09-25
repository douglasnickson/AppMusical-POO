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
		
		Administrador admin[] = new Administrador[5];
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
		
		Scanner entrada = new Scanner(System.in);
		int op = -1;
		int op2 = -1;
		int op3 = -1;
		int op4 = -1;
		int op5 = -1;
		int op6 = -1;
		int opAluno = -1;
		int opAdmin = -1;
		int opMod = -1;
		int opAss = -1;
		int opExe = -1;
		String nome_conteudo;
		boolean premium;
		boolean ativo;
		
		System.out.println("----------------------------------------");
		System.out.println("            BEM VINDO AO APP            ");
		System.out.println("----------------------------------------");
		
		
		do {
			
			System.out.println("[1] Administrador");
			System.out.println("[2] Aluno");
			System.out.println("[0] Sair");
			System.out.print("Escolha um tipo de usuario: ");
			op = entrada.nextInt();
			System.out.println("----------------------------------------");
			
			switch (op) {
			case 1:
				
				do {
					System.out.println("[1] Escolher Administrador");
					System.out.println("[2] Fazer Login");
					System.out.println("[0] Sair");
					System.out.print("Escolha uma Opcao: ");
					op5 = entrada.nextInt();
					System.out.println("----------------------------------------");		

					switch (op5) {
					case 1:
						int index = 0;
						for(Administrador i: admin) {
							if(i != null) {
								System.out.println("["+ index + "] " +i.getNome());
								index += 1;
							}else{
								break;
							}
						}
						System.out.print("Escolha um Administrador: ");
						opAdmin = entrada.nextInt();
						System.out.println("----------------------------------------");		
						break;
						
					case 2:
						if(opAdmin >= 0) {
							admin[opAdmin].fazLogin();
							do {
																
								System.out.println("[1] Cadastrar um Administrador");
								System.out.println("[2] Cadastrar Modulo");
								System.out.println("[3] Cadastrar Assunto");
								System.out.println("[4] Cadastrar Exercicio");
								System.out.println("[5] Mostrar Perfil");
								System.out.println("[0] Sair");
								System.out.print("Escolha uma Opcao: ");
								op6 = entrada.nextInt();
								System.out.println("----------------------------------------");
								
								switch (op6) {
								case 1:
									
									System.out.print("Digite o Nome: ");
									entrada.nextLine();
									String nome = entrada.nextLine();
									
									System.out.print("Digite o Login: ");
									String login = entrada.next().replaceAll("\\s","");
									
									System.out.print("Digite o Email: ");
									String email = entrada.next().replaceAll("\\s","");
									
									System.out.print("Digite o Senha: ");
									String senha = entrada.next().replaceAll("\\s","");
									
									int iAdmin = 0;
									int total_admin = admin.length;
									for(Administrador i: admin) {
						
											if(i == null) {
												admin[iAdmin] = new Administrador(nome, login, email, senha);
												gerenciamento.cadastroAdministrador(admin[opAdmin], admin[iAdmin]);
												System.out.println("----------------------------------------");		
												System.out.println("Administrador cadastrado com Sucesso!");
												System.out.println("----------------------------------------");		
												break;
											}else if(iAdmin == total_admin -1 && i != null) {
												System.out.println("----------------------------------------");		
												System.out.println("Desculpe, ainda somos uma empresa pobre");
												System.out.println("Nosso BD so suporta ate 5 Adminstradores :(");
												System.out.println("----------------------------------------");		
												break;
											}
											iAdmin += 1;
									}
									
									break;
								
								case 2:
									System.out.print("Digite o Nome do Modulo: ");
									entrada.nextLine();
									nome_conteudo = entrada.nextLine();
									
									System.out.print("Modulo Para Assinantes? True ou False ");
									premium = entrada.nextBoolean();
									
									System.out.print("Modulo Ativo? True ou False ");
									ativo = entrada.nextBoolean();
									
									int iModulo = 0;
									int total_modulo = admin.length;
									for(Modulo i: modulo) {
						
											if(i == null) {
												modulo[iModulo] = new Modulo(nome_conteudo, ativo, premium);
												gerenciamento.cadastrarModulo(admin[opAdmin], modulo[iModulo]);
												System.out.println("----------------------------------------");		
												System.out.println("Modulo cadastrado com Sucesso!");
												System.out.println("----------------------------------------");		
												break;
											}else if(iModulo == total_modulo -1 && i != null) {
												System.out.println("----------------------------------------");		
												System.out.println("Desculpe, ainda somos uma empresa pobre");
												System.out.println("Nosso BD so suporta ate 10 Modulos :(");
												System.out.println("----------------------------------------");		
												break;
											}
											iModulo += 1;
									}
									
									break;
									
								case 3:
									
									gerenciamento.listarModulos();
									System.out.print("Escolhe um Modulo: ");
									iModulo = entrada.nextInt();
									
									System.out.print("Digite o nome do Assunto: ");
									entrada.nextLine();
									nome_conteudo = entrada.nextLine();
									
									System.out.print("E para Assinantes? true ou false: ");
									premium = entrada.nextBoolean();
									
									System.out.print("Ativar o Assunto? true ou false: ");
									ativo = entrada.nextBoolean();
									
									int iAssunto = 0;
									int total_assunto = assunto.length;
									for(Assunto i: assunto) {
										if(i == null) {
											assunto[iAssunto] = new Assunto(nome_conteudo, ativo, premium);
											gerenciamento.cadastrarAssunto(admin[opAdmin], gerenciamento.buscarModulo(iModulo), assunto[iAssunto]);
											System.out.println("----------------------------------------");		
											System.out.println("Assunto cadastrado com Sucesso!");
											System.out.println("----------------------------------------");		
											break;
										}else if(iAssunto == total_assunto -1 && i != null) {
											System.out.println("----------------------------------------");		
											System.out.println("Desculpe, ainda somos uma empresa pobre");
											System.out.println("Nosso BD so suporta ate 10 Assuntos :(");
											System.out.println("----------------------------------------");		
											break;
										}
										iAssunto += 1;
									}
									
									
									break;
									
								case 4:
									
									gerenciamento.listarModulos();
									System.out.print("Escolha um Modulo: ");
									iModulo = entrada.nextInt();
									
									gerenciamento.buscarModulo(iModulo).mostrarAssuntos();
									System.out.print("Escolha um Assunto: ");
									iAssunto = entrada.nextInt();
									
									System.out.print("Digite o nome do Exercicio: ");
									entrada.nextLine();
									nome_conteudo = entrada.nextLine();
									
									System.out.print("E para Assinantes? true ou false: ");
									premium = entrada.nextBoolean();
									
									System.out.print("Ativar o Exercicio? true ou false: ");
									ativo = entrada.nextBoolean();
									
									int iExercicio = 0;
									int total_exercicio = assunto.length;
									for(Exercicio i: exercicio) {
										if(i == null) {
											exercicio[iExercicio] = new Exercicio(nome_conteudo, ativo, premium);
											
											gerenciamento.cadastrarExercicio(admin[opAdmin], gerenciamento.buscarModulo(iModulo), iAssunto, exercicio[iExercicio]);
											System.out.println("----------------------------------------");		
											System.out.println("Exercicio cadastrado com Sucesso!");
											System.out.println("----------------------------------------");		
											break;
										}else if(iAssunto == total_exercicio -1 && i != null) {
											System.out.println("----------------------------------------");		
											System.out.println("Desculpe, ainda somos uma empresa pobre");
											System.out.println("Nosso BD so suporta ate 10 Exercicios :(");
											System.out.println("----------------------------------------");		
											break;
										}
										iExercicio += 1;
									}
									
									break;
								case 5:
									System.out.println(admin[opAdmin].toString());
									System.out.println("----------------------------------------");
									break;
								default:
									break;
								}
								
							}while(op6 > 0);
							
						}else {
							System.out.println("Escolha um Administrador para Logar!");
							System.out.println("----------------------------------------");
						}
						break;
						
					default:
						break;
					}
					
				}while(op5 > 0);
				
				break;
			case 2:
				do {
					System.out.println("[1] Escolher Aluno");
					System.out.println("[2] Fazer Cadastro");
					System.out.println("[3] Fazer Login");
					System.out.println("[4] Cadastrar Novo Aluno");
					System.out.println("[0] Sair");
					System.out.print("Escolha uma Opcao: ");
					op2 = entrada.nextInt();
					System.out.println("----------------------------------------");
					
					switch (op2) {
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
						do {
							System.out.print("Escolha um Aluno: ");
							opAluno = entrada.nextInt();
							
							if(opAluno > index - 1 || opAluno < 0) {
								System.out.println("----------------------------------------");		
								System.out.println("Escolha uma opcao valida");
								System.out.println("----------------------------------------");		
							}
						}while(opAluno > index -1 || opAluno < 0);
						
						System.out.println("----------------------------------------");		
						break;
						
					case 2:
						if(opAluno >= 0) {
							aluno[opAluno].fazCadastro(gerenciamento);
						}else {
							System.out.println("Escolha um Aluno para Cadastrar!");
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
									op3 = entrada.nextInt();
									System.out.println("----------------------------------------");
									
									switch (op3) {
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
											op4 = entrada.nextInt();
											System.out.println("----------------------------------------");
											
											switch (op4) {
											case 1:
												app.fazerExercicio(opAss, opExe);
												break;
											case 2:
												String comentario;
												if(app.verificaConcluido(opAss, opExe)) {
													System.out.print("Digite o Comentario: ");
													entrada.nextLine();
													comentario = entrada.nextLine();
													app.fazerComentario(opAss, opExe, comentario);
													System.out.println("----------------------------------------");	
												}else {
													System.out.println("Conclua o Exercicio antes de Comentar! ");
													System.out.println("----------------------------------------");			
												}
												break;
											case 3:
												if(app.verificaConcluido(opAss, opExe)) {
													System.out.print("Digite a Nota: ");
													float avaliacao = entrada.nextFloat();
													app.fazerAvaliacao(opAss, opExe, avaliacao);
													System.out.println("----------------------------------------");
												}else {
													System.out.println("Conclua o Exercicio antes de Avaliar! ");
													System.out.println("----------------------------------------");	
												}
												break;
												
											default:
												break;
											}//Fim quarto Switch
											
										}while(op4 > 0);
										
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
										System.out.println("----------------------------------------");
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
									}//Fecha o terceiro Switch
									
								}while(op3 > 0);
							}
						}else {
							System.out.println("Escolha um Usuario para Logar!");
							System.out.println("----------------------------------------");	
						}
						break;
					case 4:
						String nome;
						String cpf;
						String login;
						String email;
						String senha;
						int idade;

						
						System.out.print("Digite seu nome: ");
				        entrada.nextLine();
				        nome = entrada.nextLine();
				        
						System.out.print("Digite sua idade: ");
						idade = entrada.nextInt();
						
						System.out.print("Digite seu cpf: ");
						cpf = entrada.next().replaceAll("\\s","");
						
						System.out.print("Digite seu login: ");
						login = entrada.next().replaceAll("\\s","");
						
						System.out.print("Digite seu email: ");
						email = entrada.next().replaceAll("\\s","");
						
						System.out.print("Digite sua senha: ");
						senha = entrada.next().replaceAll("\\s","");

						
						int iAluno = 0;
						int total_aluno = aluno.length;
						for(Aluno i: aluno) {
			
								if(i == null) {
									aluno[iAluno] = new Aluno(nome, idade, cpf, login, email, senha);
									System.out.println("----------------------------------------");		
									System.out.println("Aluno criado com Sucesso!");
									System.out.println("----------------------------------------");		
									break;
								}else if(iAluno == total_aluno -1 && i != null) {
									System.out.println("----------------------------------------");		
									System.out.println("Desculpe, ainda somos uma empresa pobre");
									System.out.println("Nosso BD so suporta ate 5 Alunos :(");
									System.out.println("----------------------------------------");		
									break;
								}
								iAluno += 1;
						}
						
						break;
					default:
						break;
					}//Fecha segundo Switch
				}while(op2 > 0);

				break;	
				
			default: //Primeiro Switch 
				break;
			}//fecha o primeiro switch
			
			
		}while(op > 0);
		
		System.out.println("Ate Mais, Volte Sempre!!!!");
		System.out.println("----------------------------------------");	
	}

}
