import java.util.Scanner;

class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] somai = new int[5]; 
        int[] resto = new int[5];

        for(int i = 0; i < 5; i++){
            somai[i] = in.nextInt();
        }
        int soma = 0;
        int r = 0;
        for(int i = 0; i < 5; i++){
            if(i % 2 != 0){
                soma += somai[i];
               
            } else {
                resto[r] = somai[i];
                r++;
            }
        }
		System.out.println("Soma = " + soma);
		 
		System.out.print("Resto: ");
        for(int i = 0; i < r; i++){
            System.out.print(resto[i] + " ");
        }
        in.close();
    }
}
