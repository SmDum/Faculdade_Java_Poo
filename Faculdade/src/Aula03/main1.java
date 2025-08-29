package Aula03;
public class main1 {
    public double tax = 0.05;
    public double gorjeta = 0.15;
    public double originalPrice = 10;

    public void findTotal() {
        double total  = originalPrice * (1+tax+gorjeta);
        System.out.println("Total: " + total);
    }
}


