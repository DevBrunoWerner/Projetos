package exerciciosGerais.Metodo;
import java.util.Scanner; 

class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, m;
        char let; 
        System.out.println("Digite suas duas notas arredondadas e sua letra (A ou P): ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        let = in.next().charAt(0);
        let = Character.toUpperCase(let); 
        m = calcularMedia(n1, n2, let);
        System.out.println("Sua média é: " + m);
    }

    public static int calcularMedia(int n1, int n2, char let) {
        int m = 0;
        if (let == 'A') {
            m = (n1 + n2) / 2;
            return m; 
        } else if (let == 'P') {
            m = (n1 * 7 + n2 * 3) / 10; 
            return m;
        } else {
            System.out.println("NAO E UMA LETRA VALIDA"); 
            return m; 
        }
    }
}
