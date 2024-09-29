package exerciciosGerais.Metodo;
import java.util.Scanner;

class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para mostrar as tabuadas:");
        int n = in.nextInt();
        mostrarTabuadas(n);
    }

    public static void mostrarTabuadas(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    } 
}
