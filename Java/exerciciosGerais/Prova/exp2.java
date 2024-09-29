package exerciciosGerais.Prova;
import java.util.Scanner;

class exp2 {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int A, n;
		System.out.println("Digite dois números inteiros");
		A = in.nextInt();
		n = in.nextInt();
		float soma = sequencia(A, n);
		System.out.println("Soma e igual a " + soma);
	}
	public static float sequencia(int A, int n){
		int i;
		float soma = 0;
		for (i = 1; i <= n; i++){
			soma += 1.0f / A + (1.0f / (A * i)); 
		}
		return soma;
	}
}