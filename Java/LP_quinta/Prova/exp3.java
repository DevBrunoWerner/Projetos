import java.util.Scanner;

class exp3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma, m, pg1, pg2;
        System.out.println("Insira o limite do vetor");
        int l = in.nextInt();
        int[] vet = new int[l];
        for (int i = 0; i < l; i++) {
            vet[i] = criaVet();
        }
        System.out.println("Seu vetor:");
        for (int i = 0; i < l; i++) {
            System.out.print(" | " + vet[i] + " |  ");
        }
        soma = somatorio(vet);
        System.out.println("\nSoma dos elementos: | " + soma + " | ");
        m = media(vet);
        System.out.println("Media: | " + m + " | ");

        System.out.println("Deseja rever algum elemento? (s ou n)");
        char c1 = in.next().charAt(0);
        if (c1 == 's') {
            System.out.println("Digite a posicao");
            pg1 = in.nextInt();
            oevet(vet, pg1);
        }
        System.out.println("Deseja modificar algum elemento?");
        char c2 = in.next().charAt(0);
        if (c2 == 's') {
            System.out.println("Digite a posicao");
            pg2 = in.nextInt();
            mdvet(vet, pg2);
        }
        subs(vet);
        maior(vet);
        menor(vet);
        in.close();
    }

    public static int criaVet() {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor do vetor");
        return in.nextInt();
    }

    public static int somatorio(int[] vet) {
        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
    }

    public static int media(int[] vet) {
        int media = 0;
        int soma = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        media = soma / vet.length;
        return media;
    }

    public static void oevet(int[] vet, int pg1) {
        if (pg1 < vet.length) {
            System.out.println(" numero na posicao " + pg1 + " e: | " + vet[pg1] + " | ");
        } else {
            System.out.println("numero inserido e maior que o vetor");
        }
    }

    public static void mdvet(int[] vet, int pg2) {
        Scanner in = new Scanner(System.in);
        int newn;
        if (pg2 < vet.length) {
            System.out.println("digite o numero que deseja colocar na posicao " + pg2);
            newn = in.nextInt();
            vet[pg2] = newn;
            System.out.println("Novo elemento na posicao " + pg2 + " e: | " + vet[pg2] + " | ");
        } else {
            System.out.println("numero inserido e maior que o vetor");
        }
    }

    public static void subs(int[] vet) {
        int[] vet2 = new int[vet.length];
        System.out.println("Substituindo impar com zero: ");
        for (int i = 0; i < vet.length; i++) {
            vet2[i] = vet[i];
            if (vet2[i] % 2 != 0) {
                vet2[i] = 0;
            }
            System.out.print(" | " + vet2[i] + " | ");
        }
    }

    public static void maior(int[] vet) {
        int ma = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (ma < vet[i]) {
                ma = vet[i];
            }
        }
        System.out.println("\nMaior numero " + ma);
    }

    public static void menor(int[] vet) {
        int me = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (me > vet[i]) {
                me = vet[i];
            }
        }
        System.out.println("Menor numero " + me);
    }
}
