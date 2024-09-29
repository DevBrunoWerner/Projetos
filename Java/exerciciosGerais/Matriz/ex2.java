package exerciciosGerais.Matriz;
import java.util.Scanner; 

class ex2{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int[][] mat1 = new int[2][2];
		int[][] mat2 = new int[2][2];
		int i, j; 
		
		System.out.println("Digite os dados para a primeira matriz: ");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
					System.out.print("Digite o valor da posição ["+(i+1)+"] ["+(j+1)+"] da matriz: ");
					mat1[i][j] = in.nextInt();
			}
		}
		System.out.println("Digite os dados para a segunda matriz: ");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
					System.out.print("Digite o valor da posição ["+(i+1)+"] ["+(j+1)+"] da matriz: ");
					mat2[i][j] = in.nextInt();
			}
		}
		System.out.println("Conteúdo da primeira matriz: "); 
    for(i=0; i<2; i++){
		for(j=0; j<2;j++){
        System.out.print(mat1[i][j]+" | ");
		}
System.out.println(" "); 
	}
	try{
	Thread.sleep(1500); }
			catch(InterruptedException e){
				e.printStackTrace();
			}
System.out.println("Conteúdo da segunda matriz: "); 
    for(i=0; i<2; i++){
		for(j=0; j<2;j++){
        System.out.print(mat2[i][j]+" | ");
		}
System.out.println(" "); 
	}		
		System.out.println("Soma das matrizes: ");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				mat1[i][j]+=mat2[i][j];
			}
		}
		for(i = 0; i < 2; i++){
			for(j = 0; j < 2; j++){
				System.out.print(mat1[i][j] + " | ");
			}
			System.out.println(" "); 
		}
	}
}
		
		