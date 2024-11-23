
import java.util.Random;
import java.util.Scanner;

public class exercicioD {
    /*O sistema de SPA deve validar os dados fornecidos pelo cliente, como a opção de massagem, a forma
    de pagamento e, no caso de parcelamento, o número de parcelas. Caso algum dado seja inválido, uma exceção
    personalizada será lançada. O bloco finally garantirá que a mensagem "Processamento finalizado" 
    seja sempre exibida. */
    public static class MassagemException extends Exception {
        private String message;

        public MassagemException(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
    public static class C {

        public static void massagear(String opcoes) throws MassagemException {
            Random random = new Random();
            int numeroMassagem = random.nextInt(10) + 1;

            if (opcoes.toLowerCase().equals("massagem seca")) {
                for (int i = 0; i < numeroMassagem; i++) {
                    System.out.println("massageando!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else if (opcoes.toLowerCase().equals("massagem umida")) {
                for (int i = 0; i < numeroMassagem; i++) {
                    System.out.println("massageando e molhando!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else if (opcoes.toLowerCase().equals("com creme")) {
                for (int i = 0; i < numeroMassagem; i++) {
                    System.out.println("massageando com creme!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                throw new MassagemException("Opção inválida para o serviço de SPA.");
            }
        }

        public static void skibidi(String opcoes) throws MassagemException {
            if (!opcoes.equalsIgnoreCase("MASSAGEM SECA") &&
                !opcoes.equalsIgnoreCase("MASSAGEM ÚMIDA") &&
                !opcoes.equalsIgnoreCase("COM CREME") &&
                !opcoes.equalsIgnoreCase("SEM CREME")) {
                throw new MassagemException("Opção inválida!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Você deseja: |MASSAGEM SECA|MASSAGEM UMIDA|COM CREME| || PREÇOS: |30|35|60|");
        System.out.println(" ");
        
        String opcoes = " ";

        do {
            try {
                opcoes = scanner.nextLine();
                C.massagear(opcoes);  
                break;
            } catch (MassagemException e) {
                System.out.println(e.getMessage() + " Por favor, tente novamente.");
            }
        } while (true);

        System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");
        String pagamentoSPA = scanner.nextLine();
        
        try {
            if (pagamentoSPA.toLowerCase().equals("credito")) {
                System.out.println(" ");
                System.out.println("Quantas vezes você deseja parcelar?");
                int parcelaSpa = scanner.nextInt();
                System.out.println(" ");
                return;
            }

            if (pagamentoSPA.toLowerCase().equals("pix")) {
                System.out.println(" ");
                System.out.println("Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");
                return;
            }

            if (pagamentoSPA.toLowerCase().equals("dinheiro")) {
                System.out.println("Se dirija ao caixa e pague a quantia correta! Obrigado pela escolha!");
                return;
            }

            if (pagamentoSPA.toLowerCase().equals("debito")) {
                System.out.println("Insira seu cartão! Obrigado pela escolha!");
                return;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Por favor, tente novamente.");
        }
    }
}
