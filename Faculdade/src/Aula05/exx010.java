package Aula05;

import java.util.Random;

public class exx010 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10);
        boolean par = n % 2 == 0;
        System.out.println(par);
    }
}
