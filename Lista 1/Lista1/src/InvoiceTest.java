public class InvoiceTest {
    public static void main(String[] args) {
        Invoice fatura = new Invoice("001", "Teclado Mecanico", 2, 150.0);

        System.out.println("Item: " + fatura.getNumeroItem());
        System.out.println("Descricao: " + fatura.getDescricaoItem());
        System.out.println("Quantidade: " + fatura.getQuantidadeComprada());
        System.out.println("Preco Unitario: " + fatura.getPrecoUnitario());
        System.out.println("Valor Total da Fatura: " + fatura.getInvoiceAmount());
    }
}