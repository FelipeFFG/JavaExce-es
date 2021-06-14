package ConteudosAula4;

import ConteudosAulas123.Funcionario;
import ConteudosAulas123.Gerente;

public class TesteContas {

    public static void main(String[] args) {



        //ContaCorrente
        ContaCorrente contaCorrente = new ContaCorrente(111,111);
        contaCorrente.depositar(100.0);

        //ContaPoupança
        ContaPoupanca contaPoupanca =new ContaPoupanca(222,222);
        contaPoupanca.depositar(200.0);


        contaCorrente.transeferir(contaPoupanca,10.0);

        System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta Poupança: " + contaPoupanca.getSaldo());


    }
}
