package classes;
import java.util.Scanner;

public class TestePersonagem {
    public static void main(String[] args){
        Personagem personagem = new Personagem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do personagem: ");
        personagem.nome = scanner.nextLine();

        System.out.println("Digite a vida do personagem: ");
        personagem.vida = scanner.nextInt();

        System.out.println("Digite o nivel de defesa do personagem: ");
        personagem.nivelDefesa = scanner.nextInt();

        System.out.println("Digite o nivel de força do personagem: ");
        personagem.nivelForca = scanner.nextInt();

        /* System.out.println("Nome do personagem: "+personagem.nome+
        "\nVida do personagem:"+personagem.vida+
        "\nNivel de defesa: "+personagem.nivelDefesa+
        "\nNivel de força: "+personagem.nivelForca); */

        personagem.imprimirCaracteristicas();
    }
    
}
