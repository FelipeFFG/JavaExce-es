package ConteudosAula4;

public class CalculadorImpostos {

    private double total_imposto;

    public void registra(Tributavel t){
       double valor = t.getValorImposto();
       this.total_imposto +=valor;
    }

    public double getTotal_imposto() {
        return total_imposto;
    }



}
