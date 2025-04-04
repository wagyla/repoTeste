package lista2.questao06;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    String cpf;
    String telefone;
    String endereco;
    String email;
    
    void compra (){
        System.out.printf("Nome do cliente: \n%s", this.nome);
        System.out.printf("CPF: \n%s", this.cpf);
        System.out.printf("E-mail: \n%s",this.endereco);
        System.out.printf("Endereço: \n%s", this.endereco);

    }
}
