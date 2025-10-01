package Aula8;

public class aplicacaoFIncanceira {
    String NomeTitular;
    double Saldo;
    int prazoAplicacao;
    int mesesRestantes;
    double taxaJurosMensal;


    public void definirPrazoTaxa(int tempo) {
        if (tempo >= 1 && tempo <= 12) {
            taxaJurosMensal = 0.05;
        } else if (tempo >= 13 && tempo <= 24) {
            taxaJurosMensal = 0.08;
        } else if (tempo >= 25 && tempo <= 36) {
            taxaJurosMensal = 0.18;
        } else if (tempo >= 37 && tempo <= 48) {
            taxaJurosMensal = 0.22;
        } else if (tempo > 48) {
            taxaJurosMensal = 0.30;
        }
    }

    public void calculoGanhos() {
        double ganhoTotal = Saldo + (Saldo * taxaJurosMensal * prazoAplicacao);
        System.out.println("Ganho total ao final do prazo: " + ganhoTotal);
    }

    public String getNomeTitular() {
        return NomeTitular;
    }



    public void setNomeTitular(String nomeTitular) {
        NomeTitular = nomeTitular;
    }



    public double getSaldo() {
        return Saldo;
    }



    public void setSaldo(double saldo) {
        Saldo = saldo;
    }



    public int getPrazoAplicacao() {
        return prazoAplicacao;
    }



    public void setPrazoAplicacao(int prazoAplicacao) {
        this.prazoAplicacao = prazoAplicacao;
    }



    public int getMesesRestantes() {
        return mesesRestantes;
    }



    public void setMesesRestantes(int mesesRestantes) {
        this.mesesRestantes = mesesRestantes;
    }



    public double getTaxaJurosMensal() {
        return taxaJurosMensal;
    }



    public void setTaxaJurosMensal(double taxaJurosMensal) {
        this.taxaJurosMensal = taxaJurosMensal;
    }
}
