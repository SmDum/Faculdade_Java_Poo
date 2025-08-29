package Aula03;
public class main {
    public static void main(String[] args) {
        double taxa = 0.05;
        double gorjeta = 0.15;

        double Pessoa1 = 10;
        double total = Pessoa1 * (1+taxa+gorjeta);
        System.out.println("Total = " + total);
    }
}
