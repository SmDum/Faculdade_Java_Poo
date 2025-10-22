package vinho;

public class vinhoClasse {

    private String nome;
    private String tipo;
    private int anoFabricacao;
    private double valor;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public vinhoClasse(String nome, String tipo, int anoFabricacao, double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }
    
}