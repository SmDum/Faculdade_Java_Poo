package Aula04;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Joao";
        a1.nota = 7.5;
        a1.verificarAprovacao();

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.nota = 4.0;
        a2.verificarAprovacao();
    }
}
