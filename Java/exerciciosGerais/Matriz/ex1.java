package exerciciosGerais.Matriz;
import java.util.Scanner; 

class ex1{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int[][] mat1; 
		mat1 = new int[4][4]; 
		int i, j;
	for(i=0; i<4; i++){
		for(j=0; j<4;j++){
			System.out.print("Digite o valor da posição ["+(i+1)+"] ["+(j+1)+"] da matriz: ");
            mat1[i][j] = in.nextInt();			
		}
	}
    System.out.println("Conteúdo da matriz: "); 
    for(i=0; i<4; i++){
		for(j=0; j<4;j++){
        System.out.print(mat1[i][j]+" | ");
		}
System.out.println(" "); 
	}		
	}
}