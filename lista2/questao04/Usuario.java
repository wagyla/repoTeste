package lista2.questao04;

import java.util.Scanner;

public class Usuario {
    
    String nome;
    String username;
    int senha;
    
    void autenticar (){
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a senha: ");
            int senhaDigitada = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Digite o username de login: ");
            String usernameDigitado = scanner.nextLine();
    
            if (senhaDigitada == senha && usernameDigitado.equals (username)){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               5
                System.out.printf("Acesso LIBERADO!");
            }else{
                System.out.println("Acesso NEGADO!");
            }

        }
}
