package Lp2;
import java.util.Scanner;
public class at6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = { {3, 4, 5, 6},
                        {7, 8, 9, 10},
                        {11, 12, 13, 14},
                        {15, 16, 17, 18,}};
        String nomes[] = new String[4];
        int m2[][] = { {34, 41, 45, 66},
                        {44, 85, 91, 10},
                        {11, 132, 14, 14},
                        {15, 16, 16, 15,}}; 
        char[][] matrizChar = {
            {'H', 'e', 'l', 'l', 'o'},
            {'W', 'o', 'r', 'l', 'd'},
            {'J', 'A' , 'v' , 'a'}
        };
        System.out.println("Digite oq deseja fazer");
        System.out.print("1. imprimir matriz\n2.digitar e imprimir nomes\n3.juntar matrizes\n4.juntar matriz de chars\n");
        int e = in.nextInt();
        if (e == 1) {
            printMatriz(m1);
        } else if (e == 2) {
            printNomes(nomes, in);
        } else if (e == 3) {

            int soma[][] = somaMatriz(m1, m2);
            System.out.println("Soma dos vetores: ");
            for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print("| " + soma[i][j] + " |");
            }
            System.out.println("");
        }
        } else if ( e == 4){
            String pal[] = juntarChar(matrizChar);
            for (int i = 0; i < matrizChar.length;i++){
                System.out.println(pal[i]);
            }

        }
        in.close();
    }
    private static String[] juntarChar(char[][] matrizChar){
        String resultado[] = new String[matrizChar.length];
        for(int i = 0; i < matrizChar.length; i++){
            resultado[i] = new String(matrizChar[i]);
        }
        return resultado;

    }
    
    private static void printNomes(String[] nomes, Scanner in){
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < 4; i++){
            System.out.println("Digite o nome numero " + (i + 1));
            nomes[i] = in.nextLine();
        }
        for (int i = 0; i < 4;i++){
            System.out.println("anota aí " + (i + 1) + " " + nomes[i]);
        }
    } 
    private static void printMatriz(int m1[][]) {
        for (int i = 0; i<4;i++){
        for (int j = 0; j<4;j++){
            System.out.print( "| " + m1[i][j] + " |" );
        } System.out.println(""); 
        }
        return;
    }
    private static int[][] somaMatriz(int m1[][], int m2[][]){
        int [][] matriztemp = new int[4][4];
        for(int i = 0; i<4;i++){
        for(int j = 0; j<4;j++){
            matriztemp[i][j] = m1[i][j] + m2[i][j];
        }
        }
        return matriztemp;


    }

}