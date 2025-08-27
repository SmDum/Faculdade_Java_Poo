package Aula02;

import java.util.Scanner;

public class Problema003
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double altura;
        System.out.println("Altura: ");
        altura = scanner.nextDouble();

        double raio;
        System.out.println("Raio: ");
        raio = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}