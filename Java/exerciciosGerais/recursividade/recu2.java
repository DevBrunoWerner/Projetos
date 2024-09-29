package exerciciosGerais.recursividade;

public class recu2 {
    public int mult(int n, int m){
        if(n == 1){
            return n;
        }
        else {
            return m + mult(n-1, m);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        recu2 obj = new recu2();
        System.out.println(obj.mult(n,m));
    }
}
