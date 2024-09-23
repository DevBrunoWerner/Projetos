import java.util.Scanner;

class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua nota: "); 
        double nota = in.nextDouble(); 
        char conceito = emitirConceito(nota);
        if (conceito == 'A') {
            System.out.println("Você é um aluno nota A");
        } else if (conceito == 'B') {
            System.out.println("Você é um aluno nota B");
        } else if (conceito == 'C') { 
            System.out.println("Você é um aluno nota C");
        } else if (conceito == 'D') {
            System.out.println("Você é um aluno nota D");	
        }
    }

    public static char emitirConceito(double nota) {
        char conceito;
        if (nota < 5.0) {
            conceito = 'D';
        } else if (nota >= 5.0 && nota < 7.0) {
            conceito = 'C';
        } else if (nota >= 7.0 && nota < 9.0) {
            conceito = 'B';
        } else {
            conceito = 'A';
        }
        return conceito;
    }
}
