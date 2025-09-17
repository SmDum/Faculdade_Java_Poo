package ex003;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        classeTriangulo t1 = new classeTriangulo();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor de X: ");
        t1.x = entrada.nextInt();
        System.out.println("Valor de Y: ");
        t1.y = entrada.nextInt();
        System.out.println("Valor de Z: ");
        t1.z = entrada.nextInt();

        if(t1.isTriangulo())
        {
            System.out.println("Eh um triangulo!");
            System.out.println("Classificacao: ");
            System.out.println(t1.classificar());
        }
        else
        {
            System.out.println("Nao eh um triangulo");
        }
    }
}
