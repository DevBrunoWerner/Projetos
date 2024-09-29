package exerciciosGerais.Matriz;
import java.util.Scanner;

class ex6 { 
public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	int[][] mat = new int[3][3];
	int i, j;
	
	for(i = 0;i < 3;i++){
		for(j = 0;j < 3;j++){
			if(i == j){
		    mat[i][j] = 1;
			}else{
			mat[i][j] =	0;
			}				
		}
	}
	
	System.out.println("Sua matriz identidade: ");
	
	for(i = 0;i < 3;i++){
		for(j = 0;j < 3;j++){
		System.out.print(mat[i][j] + " | ");
		}
		System.out.println(" ");
	} 

} 
}