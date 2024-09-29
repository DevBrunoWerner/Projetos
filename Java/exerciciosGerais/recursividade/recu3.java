package exerciciosGerais.recursividade;

public class recu3 {
    public int fat(int n){
        if( n == 1){
            return n;
        }else {
            return n * fat(n - 1);
        }
    } public static void main(String[] args) {
        int n = 6;
        recu3 obj = new recu3();
        System.out.println("O fatorial de " + n + " é "+ obj.fat(n) );
    }
}
