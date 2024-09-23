import java.util.Scanner;

class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo."); 
        int n = in.nextInt();
        verificarN(n);
        in.close();
    } 

    public static void verificarN(int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (n % j == 0) {
                i += j; 
            }		
        }
        if (i == n) {
            System.out.println("O numero e perfeito");
        } else {
            System.out.println("O numero nao e perfeito");
        }
    }
}  
