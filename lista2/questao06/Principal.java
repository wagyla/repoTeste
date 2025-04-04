package lista2.questao06;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Compra compra01 = new Compra();

        cliente1.nome= "Wagyla Matos";
        cliente1.cpf= "1552253399.81";
        cliente1.telefone= "33 99107385";
        cliente1.endereco= "Aleixo Paraguassu, 100, Centro. Almenara-MG";
        cliente1.email= "wagylamatos@gmail.com";
        
        produto1.nome = "Água Sanitária";
        produto1.descricao = "Tomar por dose";
        produto1.preco = 3.5;

        produto2.nome = "Batata Palha";
        produto2.descricao  = "Comível";
        produto2.preco = 11.75;

        String dadosProduto01 = String.format("%s - R$ %.2f\n", produto1.nome, produto1.preco);
        String dadosProduto02 = String.format("%s - R$ %.2f", produto2.nome, produto2.preco);

        compra01.cliente = cliente1;
        compra01.produtos = dadosProduto01 + dadosProduto02;
        compra01.valorTotal = produto1.preco + produto2.preco;

        compra01.imprimirDetalhes();
    }
    
}
