import java.util.Scanner;
import java.util.InputMismatchException;

public class questaoC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        String placaM, placaT, nomeCarro, modeloCarro;
        String numero;
        String email;
        String data;
        int idade;

        System.out.println("deseja se cadastrar? (s/n)");
        char cadastro = in.nextLine().charAt(0);
        cadastro = Character.toLowerCase(cadastro);
        boolean cadastrar = (cadastro == 's') ? true : false;

        // while para validar o cadastro e possibilitar o retorno ao inicio caso aconteça excessões
        while (cadastrar) {
            // o while true serve para 'reiniciar' o cadastro de certa informação
            // while true para validar o nome
            while (true) {
                System.out.println("digite o seu nome");
                try {
                    nome = in.nextLine();
                    if (nome.isEmpty() || nome.matches(".*\\d.*")) {
                        throw new nomeInvalidoException("nome não pode ser vazio ou conter numeros.");
                    }
                } catch (nomeInvalidoException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                break;
            }
            // while para validar o email
            while (true) {
                System.out.println("digite o seu e-mail");
                email = in.nextLine();
                // fonte para validação de email https://www.baeldung.com/java-email-validation-regex
                if (!email.matches("^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+)\\.([a-zA-Z]{2,})$")) {
                    System.out.println("E-mail inválido. Por favor, insira um e-mail válido.");
                } else {
                    break;
                }
            }
            // while para o numero de telefone
            while (true) {
                try {
                    System.out.println("Digite seu telefone sem traços nem separações:");
                    numero = in.nextLine();
                    if (!numero.matches("\\d+")) {
                        throw new numeroInvalidoException("O número de telefone deve ser sem espaços e ser apenas números.");
                    }
                    break;
                } catch (numeroInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            while (true) {
                System.out.println("Digite sua data de nascimento no formato **/**/****:");
                try {
                    data = in.nextLine();
                    if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
                        throw new IllegalArgumentException("Formato inválido! Use **/**/****.");
                    }
                    break;
                } catch (IllegalArgumentException | InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            boolean idadeVF = validarIdade(data);
            if (idadeVF) {
                System.out.println("Sua placa é Mercosul? (s/n)");
                char escolhaplaca = in.nextLine().charAt(0);
                if (escolhaplaca == 's') {
                    while (true) {
                        System.out.println("Digite a placa no formato Mercosul (AAA1B23):");
                        try {
                            placaM = in.nextLine();
                            placaM = placaM.toUpperCase();
                            validarPlacaMercosul(placaM);
                            break;
                        } catch (placaMercosulException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                } else {
                    while (true) {
                        System.out.println("Digite a placa no formato Tradicional (AAA-1234):");
                        try {
                            placaT = in.nextLine();
                            placaT = placaT.toUpperCase();
                            validarPlacaTradicional(placaT);
                            break;
                        } catch (placaTradicionalException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
                System.out.println("Digite o nome do carro:");
                nomeCarro = in.nextLine();
                System.out.println("Digite o modelo do carro:");
                modeloCarro = in.nextLine();
            } else {
                System.out.println("Você precisa ser maior de idade para cadastrar o carro.");
            }
            System.out.println("Usuario cadastrado com sucesso!");
            break;
        }
        System.out.println("Obrigado");
        in.close();
    }
    public static void validarPlacaMercosul(String placa) throws placaMercosulException {
        String formatoM = "^[A-Z]{3}[0-9][A-Z][0-9]{2}$";
        if (!placa.matches(formatoM)) {
            throw new placaMercosulException("Placa inválida! Use o formato AAA1B23.");
        }
    }
    public static void validarPlacaTradicional(String placaT) throws placaTradicionalException {
        String formatoT = "^[A-Z]{3}-[0-9]{4}$";
        if (!placaT.matches(formatoT)) {
            throw new placaTradicionalException("Placa inválida! Use o formato AAA1234.");
        }
    }
    public static class placaMercosulException extends Exception {
        public placaMercosulException(String message) {
            super(message);
        }
    }
    public static class placaTradicionalException extends Exception {
        public placaTradicionalException(String message) {
            super(message);
        }
    }
    public static class nomeInvalidoException extends Exception {
        public nomeInvalidoException(String mensagem) {
            super(mensagem);
        }
    }
    public static class numeroInvalidoException extends Exception {
        public numeroInvalidoException(String mensagem) {
            super(mensagem);
        }
    }
    public static boolean validarIdade(String data) {
        data = data.replace("/", "");
        String anoString = data.substring(4, 8);
        int anoInt = Integer.parseInt(anoString);
        int idade = 2024 - anoInt;
        return (idade >= 18);
    }
}
