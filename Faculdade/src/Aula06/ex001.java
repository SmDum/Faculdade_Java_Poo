package Aula06;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args)
    {
        String estudante1;
        String estudante2;
        int resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1° nome: ");
        estudante1 = entrada.nextLine();

        System.out.println("Digite o 2° nome: ");
        estudante2 = entrada.nextLine();


        resultado = estudante1.compareTo(estudante2);
        System.out.println("Resultado = " + resultado);
    }
}
