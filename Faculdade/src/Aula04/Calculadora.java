package Aula04;

public class Calculadora {

    public int num1;
    public int num2;

    public void somar() {
        int resultado = num1 + num2;
        System.out.println("Soma: " + resultado);
    }

    public void subtrair() {
        int resultado = num1 - num2;
        System.out.println("Subtracao: " + resultado);
    }

    public void multiplicar() {
        int resultado = num1 * num2;
        System.out.println("Multiplicacao: " + resultado);
    }

    public void dividir() {
        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("Divisao: " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
    }
}
