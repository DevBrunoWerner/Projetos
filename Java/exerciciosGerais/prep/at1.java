package exerciciosGerais.prep;

import java.util.Scanner;
public class at1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite numeros inteiros");
        int [][] mat = new int [4][4];
        int soma = 0;
        for (int i = 0;i < 4; i++){
            for (int j = 0;j < 4; j++){
                System.out.println("Digite a posição " + (i + 1) + "," + (j+1));
                mat[i][j] = in.nextInt();
        }
        }
        System.out.println("Soma de todos os números:");
        for (int i = 0;i < 4; i++){
            for (int j = 0;j < 4; j++){
                soma += mat[i][j];
            }
        }
        System.out.println(soma);

        in.close();

    }
}
