import java.util.Scanner;

public class ex2{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in); 
		System.out.println("Digite dois valores inteiros: ");
		int a = in.nextInt();
		int b = in.nextInt();
		calcularSoma(a, b); 
    }
	public static void calcularSoma (int a, int b){
		int temp = a + b; 
		System.out.println("A soma e: " + temp);
	}
}