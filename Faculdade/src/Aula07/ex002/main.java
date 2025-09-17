package ex002;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    
        classGuardiao g = new classGuardiao();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a Senha: ");
        String senhaDigitada = entrada.nextLine();

        if(g.autenticar(senhaDigitada))
        {
            System.out.println("Acesso Permitido!");
        }
        else
        {
            System.out.println("Acesso Negado...");
        }
        
        entrada.close();
    }
}