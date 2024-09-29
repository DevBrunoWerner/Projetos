package exerciciosGerais.Matriz;
import java.util.Scanner;

class ex3{
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	int[][] mat = new int[2][2];
	int i, j;
	
	System.out.println("Digite os dados da matriz: ");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			if(i >= j){
			System.out.println("Digite o valor para a posição["+(i+1)+"] ["+(j+1)+"] da matriz: ");
			mat[i][j] = in.nextInt();
		} else { mat[i][j] = 0; 
		}
		}
	}
	System.out.println("Matriz resultante: ");
	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
	System.out.print(mat[i][j] + " | ");
		}
		System.out.println(" ");
	} 
}
}