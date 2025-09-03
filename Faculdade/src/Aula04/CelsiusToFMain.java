package Aula04;

public class CelsiusToFMain {
    public static void main(String[] args) {
        CelsiusToF conversao = new CelsiusToF();
        double celsius = 25.0;
        double fahrenheit = conversao.conversao(celsius);
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    }   
}
