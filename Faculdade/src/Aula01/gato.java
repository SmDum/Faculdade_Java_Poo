package Aula01;

public class gato {
    public String nome;
    public String raca;
    public int idade;
    public String cor;

    public void miar(){
        System.out.println("Miau!");
    }

    public void passarConsulta(){
        System.out.println("O gato " + nome + " passou pela consulta.");
    }

    public void statusInternado(){
        System.out.println("O gato "+ nome + " está internado.");
    }

    public static void main(String[] args) {
    
        gato gato = new gato();

        gato.nome = "Whiskers";
        gato.raca = "Siamês";
        gato.idade = 3;
        gato.cor = "Cinza";

        gato.miar();
        gato.passarConsulta();
        gato.statusInternado();
    }

}

/*
 * Classe Gato:
 * 
 * Atributos:
 * + Nome
 * + Raça
 * + Idade
 * + Cor
 * 
 * Métodos:
 * + Miar()
 * + PassarConsulta()
 * + StatusInternado()
 * 
 */