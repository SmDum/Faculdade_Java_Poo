package Aula05;
import java.util.Random;

public class ex002 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(5) + 1;
        System.out.println(numero);
    }
}
