package ex002;

public class classGuardiao{
    public String senha = "solo";
    public String usuario;
    public int codigo_magico;

    public boolean autenticar(String senhaDigitada){
        if(senha.equals(senhaDigitada)){
            return true;
        } else {
            return false;
        }
    }
}