package exerciciosGerais.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
			        
					        Pessoa p1 = new Pessoa();
							
							        System.out.print("Digite o nome: ");
									        String nome = in.nextLine();
											        p1.setNome(nome);
													
													        System.out.print("Digite o CPF: ");
													        int cpf = in.nextInt();
													        p1.setCpf(cpf);
													
													//        System.out.print("Digite o telefone: ");
													//        int tel = in.nextInt();
													//        p1.setTel(tel);
													//        in.nextLine();  
													//        System.out.print("Digite o endereço: ");
													//        String end = in.nextLine();
													//        p1.setEnd(end);
													
													//        System.out.println("Detalhes Inseridos:");
													        System.out.println("Nome: " + p1.getNome());
															System.out.println("CPF: " + p1.getCpf());
															//        System.out.println("Telefone: " + p1.getTel());
															//        System.out.println("Endereço: " + p1.getEnd());
															
															        in.close();
																	    
																		}}