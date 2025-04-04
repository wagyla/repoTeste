package Conta;

public class Conta {
    private Cliente titular;
    private double saldo;
    private String numero;

   
    public void sacar (double valor){
        if (valor > this.saldo){
            System.out.println("Não posso sacar um valor maior que o saldo!")
        }else{
            this.saldo -= valor;
            System.out.printf("\nSaque de "+valor+" efetuado");
        }       
    }
    
    public void depositar (double valor){
        this.saldo += valor;
        System.out.printf("\nDeposito de "+valor+" efetuado");
    }
    public void imprimirDetalhes(){
        System.out.printf("\nTitular: \t%s\n",this.titular.nome);
        System.out.printf("Saldo: \t\tR$%.2f\n",this.saldo);
        System.out.printf("Numero: \t%s\n", this.numero);
    }
    public void tranferir (Conta destino, float valor){

        this.sacar(valor);
        destino.depositar(valor);
        System.out.printf ("\nTransferencia efetuada da conta %s no valor de R$%.2f para a conta %s\n", 
        this.titular, valor, destino.titular);
    }
}
