import java.util.Scanner;

class exstrings {
public static void main(String[]args){ 
    Scanner in = new Scanner(System.in);
	System.out.println("Digite o seu nome: ");
	    StringBuffer sb = new StringBuffer(in.nextLine());
	System.out.println("Digite o seu sobrenome: ");
	    StringBuffer sb2 = new StringBuffer(in.nextLine());
	sb.append(" ");
	sb.append(sb2);
	System.out.println("Digite a sua cidade: ");
	    StringBuilder sbd = new StringBuilder(in.nextLine());
	sbd.append(" ");
	sbd.append("e a melhor cidade. ");
	    String par = ("cetim"); 
	    String impar = ("salina");
	        System.out.println("Agr digite um numero inteiro: "); 
	    int i = in.nextInt();
	    if(i % 2 == 0){
		    System.out.println("Seu nome: " + sb);
		    System.out.println(" " + sbd);
		    System.out.println("A palavra de hoje é: " + par);
	}
	else{
		    System.out.println("Seu nome: " + sb);
		    System.out.println(" " + sbd);
		    System.out.println("A palavra de hoje é: " + impar);
	}
	in.close();
}
}