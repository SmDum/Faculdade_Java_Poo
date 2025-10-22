package vinho;
import java.util.Scanner;

public class Vinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        vinhoClasse[] vinhos = new vinhoClasse[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do vinho:");
            String nome = scanner.nextLine();

            System.out.println("Digite o tipo do vinho:");
            String tipo = scanner.nextLine();

            System.out.println("Digite o ano de fabricação do vinho:");
            int anoFabricacao = scanner.nextInt();

            System.out.println("Digite o valor do vinho:");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // consumir a nova linha

            vinhos[i] = new vinhoClasse(nome, tipo, anoFabricacao, valor);
        }

        int idMaisCaro = 0;
        for (int i = 1; i < 3; i++) {
            if (vinhos[i].getValor() > vinhos[idMaisCaro].getValor()) {
                idMaisCaro = i;
            }
        }

        int maisVelho = 0;
        for (int i = 1; i < 3; i++) {
            if (vinhos[i].getAnoFabricacao() < vinhos[maisVelho].getAnoFabricacao()) {
                maisVelho = i;
            }
        }

        System.out.println("O vinho mais caro é: " + vinhos[idMaisCaro].getNome());
        System.out.println("O vinho mais velho é: " + vinhos[maisVelho].getNome());

        scanner.close();
    }
}
