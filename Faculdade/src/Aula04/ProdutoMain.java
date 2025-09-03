package Aula04;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Celular";
        p1.preco = 1200.00;
        p1.desconto = 10;

        p1.darDesconto();
    }
}
