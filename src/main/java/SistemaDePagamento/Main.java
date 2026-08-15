package SistemaDePagamento;

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito();
        FormaPagamento pix = new Pix();

        System.out.println("--- Teste Individual ---");
        cartao.processarPagamento(100.0);
        System.out.println();
        pix.processarPagamento(100.0);
    }
}
