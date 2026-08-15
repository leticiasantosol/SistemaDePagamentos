package SistemaDePagamento;

public class CartaoCredito extends FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        double taxa = valor * 0.05;
        double valorFinal = valor + taxa;
        System.out.print("Processando R$" + valor + " no Cartão de Crédito. Cobrando taxa de 5%.");
        System.out.println("Taxa (5%): R$ " + taxa);
        System.out.println("Total a pagar: R$ " + valorFinal);
    }
}
