package exerciciosGerais.Vetor;
import java.util.Scanner;
class ex5 {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in); 
		int[] ar = new int[10];
		
		for (int i = 0; i < 10; i++){
		ar[i] = in.nextInt();
		}
		System.out.println("Esses são os números pares: ");
		for (int i = 0; i < 10; i++) {
		if (ar[i] % 2 == 0){
			System.out.print(ar[i] + "|");
		}
		}
	}
}