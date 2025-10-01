package Aula8;

public class contaCorrente {
    String Nome;
    double Saldo;
    double Juros;

    public String getNome() {
        return Nome;
    }


    public void setNome(String nome) {
        Nome = nome;
    }


    public double getSaldo() {
        return Saldo;
    }


    public void setSaldo(double saldo) {
        Saldo = saldo;
    }


    public double getJuros() {
        return Juros;
    }


    public void setJuros(double juros) {
        Juros = juros;
    }

    void criarContaCorrente (String nomeConta, double saldo, double juros) {
        Nome = nomeConta;
        Saldo = saldo;
        Juros = juros;

    }

    void exibirDados() {
        System.out.println("Nome: " + Nome);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Juros: " + Juros);
    }
}
