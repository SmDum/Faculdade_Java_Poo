package Aula02;

import java.util.Scanner;

public class Problema002 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o salário mínimo: ");
    float salarioMinimo = scanner.nextFloat();
    float valorQuilowatt = salarioMinimo/500;

    System.out.println("Digite quantos Quilowatts você usou: ");
    float qtdQuilowatts = scanner.nextFloat();

    float valorPago = valorQuilowatt * qtdQuilowatts;
    System.out.println("Valor pago pela residência: " + valorPago);

    float valorComDesconto = (float) (valorPago * 0.85);
    System.out.println("Valor pago com o desconto de 15%: " + valorComDesconto);

    scanner.close();
 }
}
