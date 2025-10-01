package Aula8;

public class AlunoMain {

    public static void main(String[] args) {

        int x = 100;
        int y = 100;
    
        Aluno aluno1 = new Aluno();
        aluno1.Nome = "Samuel";
        aluno1.Idade = 19;
        aluno1.Curso = "Análise e Desenvolvimento de Sistemas";
        aluno1.Matricula = 123456;
        aluno1.email = "samuel@gmail.com";

        Aluno aluno2 = new Aluno();
        aluno2.Nome = "Samuel";
        aluno2.Idade = 19;
        aluno2.Curso = "Análise e Desenvolvimento de Sistemas";
        aluno2.Matricula = 123456;
        aluno2.email = "samuel@gmail.com";

        if (x == y) {
            System.out.println("x é igual a y");
        }

        if (aluno1 == aluno2) {
            System.out.println("São o mesmo objeto");
        }


    }
}
