package ConteudosAulas123;

public class SistemaInterno {

    private int senha =222;

    public void autentica(Autenticavel g){
        boolean autenticou = g.autentica(this.senha);
        if (autenticou){
            System.out.println("pode entrar no sistema!");
        }else{
            System.out.println("Nao pode entrar no sistema");
        }
    }





}
