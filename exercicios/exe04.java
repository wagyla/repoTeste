package exercicios;
import java.util.Scanner;

public class exe04 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite um valor: ");
        int num = scanner.nextInt();

        for (int soma; num > 0; num--){
            soma = num + num;
        System.out.println ("A soma dos valores é: "+soma);
        break;
        }
    }
    
}
