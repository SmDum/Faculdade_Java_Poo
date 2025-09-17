package ex001;

public class main {
    public static void main(String[] args)
    {
        classePrincesa p = new classePrincesa();

        p.nome = "Léia";
        p.idade = 19;

        if(p.isMaiorIdade())
        {
            System.out.println("Maior de Idade");
        }
        else
        {
            System.out.println("Menor de Idade");
        }
    }
}