package difPontos;
import java.util.Scanner;

public class DifPontos
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Ponto p1 = new Ponto(0,0);
        Ponto p2 = new Ponto(0,0);

        System.out.println("Digite a coordenada x do primeiro ponto:");
        p1.setX(sc.nextDouble());
        System.out.println("Digite a coordenada y do primeiro ponto:");
        p1.setY(sc.nextDouble());

        System.out.println("Digite a coordenada x do segundo ponto:");
        p2.setX(sc.nextDouble());
        System.out.println("Digite a coordenada y do segundo ponto:");
        p2.setY(sc.nextDouble());

        double distancia = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        System.out.println("A distância entre os dois pontos é: " + distancia);

        sc.close();
    }
}