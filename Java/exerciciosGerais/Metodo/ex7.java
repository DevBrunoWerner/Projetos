package exerciciosGerais.Metodo;
import java.util.Scanner;

class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet = new int[3]; 
        lerVetor(in, vet);
        imprimirVet(vet);
    }

    public static void lerVetor(Scanner in, int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite os números do vetor:");
            vet[i] = in.nextInt();
        }
    } 
    
    public static void imprimirVet(int[] vet) {
        System.out.println("Vetor: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    } 
}
