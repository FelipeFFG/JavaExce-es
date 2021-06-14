package ConteudosAulas123;

public class ControleBonificacao {

    private  double soma;


    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        soma +=boni;
    }

    public double getSoma() {
        return soma;
    }



}
