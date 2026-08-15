package SistemaDePagamento;

public class CartaoCredito extends FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.print("Processando R$" + valor + " no Cartão de Crédito. Cobrando taxa de 5%.");
    }
}
