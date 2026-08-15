package SistemaDePagamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Teste com Array (Simulando um Carrinho) ---");

        FormaPagamento[] listaDePagamentos = new FormaPagamento[3];
        listaDePagamentos[0] = new CartaoCredito();
        listaDePagamentos[1] = new Pix();
        listaDePagamentos[2] = new Pix();

        for (FormaPagamento p : listaDePagamentos) {
            p.processarPagamento(250.0);
            System.out.println("---------------------------");
        }
    }
}
