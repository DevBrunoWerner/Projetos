import java.util.Scanner;

class exp1 {
public static void main (String[]args) {
	Scanner in = new Scanner(System.in);
	int A, B;
	System.out.println("Digite um numero de quatro digitos");
	A = in.nextInt();
	System.out.println("Digite um numero de dois digitos");
	B = in.nextInt();
	encaixa(A, B);
}

public static void encaixa (int A, int B){
	int du = A % 100;
	if (du == B){
		System.out.println("Encaixa");
	} else {
		System.out.println("Nao encaixa");
	}
}
}