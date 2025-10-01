package Aula8;

public class main {
    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente();
        conta1.criarContaCorrente("João", 1000, 0.05);
        
        conta1.exibirDados();
    } 
}