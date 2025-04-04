package classes;
public class Personagem {
    String nome;
    int vida;
    int nivelForca;
    int nivelDefesa;

    void imprimirCaracteristicas(){

        String nomePersonagem = this.nome;
        System.out.println("Nome do personagem: "+this.nome);
        System.out.println("Vida: "+this.vida);
        System.out.println ("Nivel de Força: "+this.nivelForca);
        System.out.println("Nivel de defesa: "+this.nivelDefesa);

    } 

}