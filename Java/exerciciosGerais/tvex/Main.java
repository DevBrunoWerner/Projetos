package exerciciosGerais.tvex;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tv tv1 = new Tv();
        boolean running = true;

        while (running) {
            System.out.println("Digite true para assistir, false para não assistir");
            boolean sN = in.nextBoolean();
            in.nextLine(); // Consome a nova linha

            if (sN) {
                System.out.println("Qual o Streaming?");
                String sm = in.nextLine();
                tv1.setSm(sm);

                System.out.println("Filme ou programa?");
                String escolha = in.nextLine();

                if (escolha.equalsIgnoreCase("filme")) {
                    System.out.println("Escolha o filme");
                    String fm = in.nextLine();
                    tv1.setFm(fm);
                } else if (escolha.equalsIgnoreCase("programa")) {
                    System.out.println("Escolha o programa");
                    String pg = in.nextLine();
                    tv1.setPg(pg);
                }
				
				tv1.detalhes(escolha);

            } else {
                System.out.println("A TV permanece desligada");
                running = false; // Sai do loop se o usuário escolher não assistir
            }
        }

        in.close(); // Fecha o Scanner
    }
}
