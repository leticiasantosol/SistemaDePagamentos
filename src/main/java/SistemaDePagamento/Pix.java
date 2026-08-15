package SistemaDePagamento;

public class Pix extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {
        double desconto = valor * 0.10;
        double valorFinal = valor - desconto;
        System.out.print("Processando R$" + valor + " via PIX. Desconto de 10$ aplicado!");
        System.out.println("Taxa (5%): R$ " + desconto);
        System.out.println("Total a pagar: R$ " + valorFinal);
    }

}
