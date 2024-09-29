package exerciciosGerais.Matriz;
import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mat = new int[2][2];
        int i, j;

        System.out.println("Digite os dados da matriz: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("Digite o valor para a posição[" + (i + 1) + "][" + (j + 1) + "] da matriz: ");
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println("Coluna 1: ");
        for (i = 0; i < 2; i++) {
            System.out.print(mat[i][0] + " | \n");
        }
        System.out.println(" ");

        System.out.println("Coluna 2: ");
        for (i = 0; i < 2; i++) {
            System.out.print(mat[i][1] + " | \n");
        }
        System.out.println(" ");
    }
}
