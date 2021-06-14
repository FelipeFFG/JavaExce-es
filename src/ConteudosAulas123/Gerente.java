package ConteudosAulas123;

//Gerente eh um funcionario, Gerente herda da classe funcioanario,assina contrato autenticavel, eh um autenticavel.
public class Gerente extends Funcionario implements Autenticavel{

    private int senha;
    private AutenticacaoUtil autenticador;

    public Gerente(){
        autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {       //chama o metodo do implementes Auteticavel
        this.autenticador.setSenha(senha);  // delega o trabalho para classe AutenticacaoUtil
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    public double getBonificacao(){
        System.out.println("chamando o metodo de bonificação do gerente");
        return super.getSalario();                       //super sinaliza que o atributo vem da classe super,base class, ou seja nao esta sendo definida nesta calsse.
                                                         //alem de ser utlizado para trazer metodos da classe super,reaproveitando os conteudos da classe extendida.
    }
}
