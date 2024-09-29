package exerciciosGerais.Vetor;
import java.util.Scanner;
class ex3 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	 int[] dados = new int[5];
	 for (int i = 0; i < 5; i++){
	    dados[i] = input.nextInt();	 
	 }
	int maior = dados[0];
	for (int i = 1; i < dados.length; i++) {
		if (dados[i] > maior) {
			maior = dados[i];
		}
	}
	System.out.println("O maior número é: " + maior);
	}
}