import java.util.Scanner;

class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        
        System.out.println("Digite 5 números para o vetor A:");
        
        for(int i = 0; i < 5; i++){
            A[i] = in.nextInt();
        }
        System.out.println("Digite 5 números para o vetor B:");
        
        for(int i = 0; i < 5; i++){
            B[i] = in.nextInt();
        }
        
        System.out.print("\nVetor A: ");
        for(int i = 0; i < 5; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("|");
        
        try{
            Thread.sleep(2000);
        } 
        catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.print("\nVetor B: ");
        for(int i = 0; i < 5; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println("|");
        
        // Trocando os elementos entre os vetores
        for(int i = 0; i < 5; i++){
            int t = A[i];
            A[i] = B[4 - i];
            B[4 - i] = t; 
        }
        
        System.out.print("\nVetor A trocado: ");
        for(int i = 0; i < 5; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("|");
        
        try{
            Thread.sleep(2000);
        } 
        catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.print("\nVetor B trocado: ");
        for(int i = 0; i < 5; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println("|");
        
        in.close();
    }
}
