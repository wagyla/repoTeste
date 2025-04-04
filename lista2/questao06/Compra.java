package lista2.questao06;

public class Compra {
    double valorTotal;
    String produtos;
    Cliente cliente;

    void imprimirDetalhes() {
        System.out.printf("Cliente: %s\n", this.cliente.nome);
        System.out.printf("-- Produtos -- \n%s\n\n", this.produtos);
        System.out.printf("Valor total: R$ %.2f", this.valorTotal);
    }
}
