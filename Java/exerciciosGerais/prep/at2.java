package exerciciosGerais.prep;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        int [][] mat1 = new int[2][2];
        int [][] mat2 = new int[2][2];
        int [][] mat3 = new int[4][4]; // Inicializa a matriz 4x4 com valores 0 por padrão
        Scanner in = new Scanner(System.in);

        // Entrada para a primeira matriz 2x2
        System.out.println("Digite os dados em int da primeira matriz:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                mat1[i][j] = in.nextInt();
            }
        }

        // Entrada para a segunda matriz 2x2
        System.out.println("Digite os dados em int da segunda matriz:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                mat2[i][j] = in.nextInt();
            }
        }

        // Copiando os valores da primeira matriz para o canto superior esquerdo de mat3
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat3[i][j] = mat1[i][j];
            }
        }

        // Copiando os valores da segunda matriz para o canto inferior direito de mat3
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat3[i + 2][j + 2] = mat2[i][j]; // Aqui está correto, acessando mat2[i][j]
            }
        }

        // Imprimindo a matriz completa mat3
        System.out.println("A sua matriz completa é:");
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", mat3[i][j]); // %4d para alinhar números inteiros com largura de 4
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }

        in.close();
    }
}
//aparentemente eu to ficando louco pq tava exatamente igual e só funcionou dps