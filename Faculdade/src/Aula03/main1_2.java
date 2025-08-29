package Aula03;

public class main1_2 {
    public static void main(String[] args) {
        main1 calc = new main1();
        calc.tax = 0.03;
        calc.originalPrice = 10;
        calc.gorjeta = 0.2;
    
        calc.findTotal();
    }

}
