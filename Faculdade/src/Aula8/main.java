package Aula8;

public class main {
    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente();
        contaCorrente conta2 = new contaCorrente();
        aplicacaoFIncanceira aplicacao1 = new aplicacaoFIncanceira();

        conta1.criarContaCorrente("Joao", 1000, 0.05);
        conta2.criarContaCorrente("Maria", 2000, 0.03);
        
        aplicacao1.setNomeTitular("Carlos");
        aplicacao1.setSaldo(1500);
        aplicacao1.setPrazoAplicacao(18);
        aplicacao1.definirPrazoTaxa(aplicacao1.getPrazoAplicacao());
        aplicacao1.calculoGanhos();

        
        conta1.exibirDados();
        conta1.depositar(500);
        conta1.exibirInformacoes();
        conta1.sacar(200);
        conta1.exibirInformacoes();
        conta1.transferir(conta2, 300);
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
    } 
}