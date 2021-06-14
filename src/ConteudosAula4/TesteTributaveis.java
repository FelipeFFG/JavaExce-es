package ConteudosAula4;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.depositar(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImpostos calculadorImpostos = new CalculadorImpostos();


        calculadorImpostos.registra(cc);
        calculadorImpostos.registra(seguro);

        System.out.println(calculadorImpostos.getTotal_imposto());



    }
}
