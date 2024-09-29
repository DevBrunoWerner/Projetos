package exerciciosGerais.String;
import java.util.Scanner; 

class ex2 {
	public static void main(String[]args){
    Scanner in = new Scanner(System.in); 
	System.out.println("Digite seu nome: ");
	String str = in.nextLine();
	str = str.toLowerCase();
	int cont = 0;
	for (int i = 0; i < str.length(); i++){
		if (str.charAt(i) == 'a' 
		|| str.charAt(i) == 'e'
        || str.charAt(i) == 'i'
        || str.charAt(i) == 'o'
        || str.charAt(i) == 'u'){
			cont++;
		}
	}
	System.out.println("Vogais no seu nome: " +cont );
	}
}