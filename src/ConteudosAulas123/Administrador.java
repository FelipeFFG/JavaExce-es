package ConteudosAulas123;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;
    private AutenticacaoUtil autenticador;

    public Administrador(){
        autenticador  = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {       //chama o metodo do implementes Auteticavel
        this.autenticador.setSenha(senha);  // delega o trabalho para classe AutenticacaoUtil
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
