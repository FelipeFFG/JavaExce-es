package ConteudosAulas123;

public class Cliente implements Autenticavel {

    private AutenticacaoUtil autenticador;


    public Cliente(){
       this.autenticador = new  AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {       //chama o metodo do implementes Auteticavel
       this.autenticador.setSenha(senha);  // delega o trabalho para classe AutenticacaoUtil
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
