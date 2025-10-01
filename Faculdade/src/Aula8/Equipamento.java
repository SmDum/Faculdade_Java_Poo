package Aula8;

public class Equipamento {
    private String nome;
    private String tipo;
    private String fabricante;
    private int anoFabricacao;
    private double valor;

    // Construtor
    public Equipamento(String nome, String tipo, String fabricante, int anoFabricacao, double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Ano de Fabricacao: " + this.anoFabricacao);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("---------------------");
    }
}