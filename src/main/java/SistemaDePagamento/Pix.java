package SistemaDePagamento;

public class Pix extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {
        double desconto = valor * 0.10;
        double valorFinal = valor - desconto;
        System.out.println("Processando R$" + valor + " via PIX. Desconto de 10$ aplicado!");
        System.out.println("Desconto (10%): R$ " + desconto);
        System.out.println("Total a pagar: R$ " + valorFinal);
    }

}
