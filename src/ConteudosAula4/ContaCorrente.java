package ConteudosAula4;



//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel{  //herda os atributos e metodos porem nao herda os construtores da classe.

    private CalculadorImpostos calc;

    public ContaCorrente(int agencia,int numero){  //tenta chamar o contrutor da classe mae
        super(agencia,numero);                     //chamada do construtor  da classe mae.
        calc = new CalculadorImpostos();
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.2;
        return super.sacar(valorASacar);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }


    @Override
    public double getValorImposto() {
        return super.saldo*0.01;
    }
}
