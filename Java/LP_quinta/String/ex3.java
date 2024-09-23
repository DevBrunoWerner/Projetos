                    
import java.util.Scanner; 

class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Digite qualquer palavra: ");
        String str = in.nextLine();
        str = str.toLowerCase();md
		String mod = str.replace('a', '*');
		System.out.println("Palavra sem modificacao" + str);
        System.out.println("Palavra modificada" + mod);		
    }
}