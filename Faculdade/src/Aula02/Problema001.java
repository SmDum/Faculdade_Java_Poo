package Aula02;

import java.util.Scanner;

public class Problema001 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String nome = "Joao";

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o ano de nascimento de João ");
        int anoNascimento = scanner.nextInt();
        
        int anos = anoAtual - anoNascimento;
        int anos2024 = 2024 - anoNascimento;

        System.out.println(nome + " tem " + anos + " e terá " + anos2024 + " em 2024.");

        scanner.close();
    }
}
