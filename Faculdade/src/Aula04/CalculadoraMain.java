package Aula04;
import java.util.Scanner;


public class CalculadoraMain {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        calc.num1 = scanner.nextInt();
        calc.num2 = scanner.nextInt();
        
        calc.somar();
        calc.subtrair();
        calc.multiplicar();
        calc.dividir();
    }
}
