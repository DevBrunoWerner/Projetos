package exerciciosGerais.Vetor;
import java.util.Scanner;
class ex1 {
public static void main (String[]args){
	Scanner in = new Scanner(System.in);
	System.out.println("Digite cinco números.");
	int[] dados = new int[5];
	for(int i = 0; i < 5; i++){
		dados[i] = in.nextInt();
	}
	try{
		Thread.sleep(2000);
} catch (InterruptedException e){
	e.printStackTrace();
}
	for(int i = 4; i >= 0; i--){
		System.out.println(dados[i]); 
	}		
	in.close();
}
}