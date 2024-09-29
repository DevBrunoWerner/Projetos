package exerciciosGerais.Vetor;
import java.util.Scanner;
class ex2 {
public static void main (String[]args){
	Scanner in = new Scanner(System.in);
	System.out.println("Digite cinco números.");
	int[] dados = new int[5];
	int[] multi = new int[5];
    for(int i = 0; i < 5; i++){
		dados[i] = in.nextInt();
		multi[i] = dados[i]*3;
	}
	
	System.out.print("vetor triplicado: \n");
	for (int i = 0; i < 5; i++){ 
	System.out.print(multi[i] + "|");
	}
	System.out.print("\n vetor og: \n"); 
	for (int i = 0; i < 5; i++){
	System.out.print(dados[i] + "|");
	}
	in.close();
}
}