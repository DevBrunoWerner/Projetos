public class exercicioE {
            /*Um sistema de delivery de comida deve verificar se os dados do pedido são válidos. Os dados são:
            número de itens no pedido (não pode ser zero ou negativo), valor total do pedido 
            (deve ser maior que zero), código de cupom de desconto (se fornecido, deve ser alfanumérico 
            de 5 caracteres). Se algum dos dados for inválido, uma exceção personalizada deve ser lançada.
            O bloco finally garante que a mensagem de processamento finalizado seja sempre exibida.
             */
    public static void main(String[] args) {
        try {
            int numeroItens = 3;  
            double valorTotal = 150.75;  
            String codigoDesconto = "DES10";  

            double valorFinal = processarPedido(numeroItens, valorTotal, codigoDesconto);
            System.out.println("Valor final do pedido: " + valorFinal);

        } catch (PedidoInvalidoException e) {
            System.out.println("Erro no pedido: " + e.getMessage());
        } finally {
            System.out.println("Processamento do pedido finalizado.");
        }
    }

    public static double processarPedido(int numeroItens, double valorTotal, String codigoDesconto) throws PedidoInvalidoException {
        if (numeroItens <= 0) {
            throw new PedidoInvalidoException("Número de itens no pedido não pode ser zero ou negativo.");
        }

        if (valorTotal <= 0) {
            throw new PedidoInvalidoException("O valor total do pedido deve ser maior que zero.");
        }

        if (codigoDesconto != null && !codigoDesconto.matches("[A-Za-z0-9]{5}")) {
            throw new PedidoInvalidoException("Código de desconto inválido. Deve ser alfanumérico e ter 5 caracteres.");
        }

        double valorFinal = valorTotal;
        if (codigoDesconto != null) {
            valorFinal -= valorFinal * 0.10;
        }

        return valorFinal;
    }
}

class PedidoInvalidoException extends Exception {
    public PedidoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
