package Aula04;

public class Produto {
    public String nome;
    public double preco;
    public double desconto;

    public void darDesconto()
    {
        preco = preco - (preco * desconto / 100);
        System.out.println("O novo preCo do produto " + nome + " eh: " + preco);
    }
}
