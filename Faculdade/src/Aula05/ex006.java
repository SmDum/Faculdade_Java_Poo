package Aula05;
import java.util.Random;

public class ex006 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(3); 
        String[] cores = {"Azul", "Verde", "Vermelho"};
        System.out.println(cores[x]);
    }
}
