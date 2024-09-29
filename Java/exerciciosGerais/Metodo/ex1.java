package exerciciosGerais.Metodo;
import java.util.Scanner;

public class ex1{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in); 
		System.out.println("Digite qualquer valor inteiro: ");
		int a = in.nextInt();
		verificarValor(a); 
    }
	public static void verificarValor (int a){
	if (a % 2 == 0){
		System.out.println("O numero e par. ");
	}	else { 
	        System.out.println("O numero e impar. ");
	}
	}
}