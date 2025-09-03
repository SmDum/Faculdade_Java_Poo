package Aula04;

public class Retangulo {
    public int base;
    public int altura;

    public void calcularArea() {
        int area = base * altura;
        System.out.println("A area do retangulo eh: " + area);
    }

    public void calcularPerimetro() {
        int perimetro = 2 * (base + altura);
        System.out.println("O perimetro do retangulo eh: " + perimetro);
    }
}