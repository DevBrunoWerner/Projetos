package Lp2;
import java.util.Scanner;
public class at4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat[][] = { { 1, 2, 3, 4, 5 }, 
                        { 4, 5, 6, 7 , 8}, 
                        { 7, 8, 9, 10, 11 }, 
                        { 10, 11, 12, 13, 14 }, 
                        { 13, 14, 15, 16, 17 } }; 
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                if (i == j) {
                                    System.out.print(mat[i][j] + " ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();  
                        }
        System.out.println("Sua diagonal secundaria");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4;j++){
                if (i == j){
                    System.out.print(mat[i+1][j+1] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
    
}