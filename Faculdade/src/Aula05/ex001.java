package Aula05;

public class ex001 {
    public static void main(String[] args) {
        String frase = " Engenharia de Computação ";
        String resultado = frase.trim().toUpperCase().substring(0, 10);
        System.out.println(resultado);
    }
}
