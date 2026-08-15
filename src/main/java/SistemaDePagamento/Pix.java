package SistemaDePagamento;

public class Pix extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.print("Processando R$" + valor + " via PIX. Desconto de 10$ aplicado!");
    }

}
