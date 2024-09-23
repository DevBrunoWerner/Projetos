import java.util.Scanner; 

class ex1 {
public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.println("Digite o primeiro nome: ");
String n1 = in.nextLine();
System.out.println("Digite o segundo nome: ");
String n2 = in.nextLine();
System.out.println("Primeiro nome \n" + n1);
System.out.println("Segundo nome \n" + n2);
System.out.println("Segundo caractere do primeiro nome  " + n1.charAt(1));
System.out.println("Segundo caractere do segundo nome  " + n2.charAt(1));
in.close();
} 
}