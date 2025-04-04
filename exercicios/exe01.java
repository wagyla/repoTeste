package exercicios;


import java.util.Scanner;

public class exe01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.println ("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println (n1+ " é maior que " + n2);
        }else{
            System.out.println (n2 + "é maior que "+n1);
        }
    }
} 
