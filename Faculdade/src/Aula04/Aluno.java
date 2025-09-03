package Aula04;

public class Aluno {
    public String nome;
    public double nota;

    public void verificarAprovacao()
    {
        if(nota>=5)
        {
            System.out.println(nome + " esta aprovado com a nota " + nota);
        }
        else
        {
            System.out.println(nome + " esta reprovado com a nota " + nota);
        }
    }
}
