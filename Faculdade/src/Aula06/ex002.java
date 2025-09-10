package Aula06;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        String estudante1;
        String estudante2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro Nome: ");
        estudante1 = entrada.nextLine();
        System.out.println("Digite o Segundo Nome: ");
        estudante2 = entrada.nextLine();
        boolean resultado = estudante1.equalsIgnoreCase(estudante2);
        System.out.println(estudante1 + " eh igual a " + estudante2 + "?" + resultado);
         if(resultado == false)
        {
            if(estudante1.compareTo(estudante2) < 0)
            {
                System.out.println("Primeiro no alfabeto: " + estudante1);
            }
        }
        else
        {
            if(estudante1.compareTo(estudante2) > 0)
            {
                System.err.println("Primeiro no alfabeto: " + estudante2);
            }
        }
    }
}