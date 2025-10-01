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

    void depositar(double valor) {
        Saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= Saldo) {
            Saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void calcularJuros() {
        Saldo += Saldo * Juros;
    }

    void transferir(contaCorrente contaDestino, double valor) {
        if (valor <= Saldo) {
            Saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void exibirInformacoes() {
        System.out.println("Nome: " + Nome);
        System.out.println("Saldo: " + Saldo);
    }
}
