package Aula06;

public class ex004 {
    public static void main(String[] args) {
        String texto = "O número é: ";
        int numero = 42;

        // Usando o operador +
        String resultado1 = texto + numero;
        System.out.println("Usando '+': " + resultado1);

        // Usando o método concat (precisa converter o inteiro para String)
        String resultado2 = texto.concat(Integer.toString(numero));
        System.out.println("Usando 'concat': " + resultado2);

        // Diferença:
        // O operador '+' converte automaticamente o inteiro para String e faz a concatenação.
        // O método concat só funciona entre Strings, então é necessário converter o inteiro antes.
    }
}