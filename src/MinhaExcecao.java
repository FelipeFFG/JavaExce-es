//pego os atributos e funcoes da RuntimeExcepetion
public class MinhaExcecao extends Exception{                    //checked

    public MinhaExcecao(String msg) {
        super(msg);               //repassando a string para a classe mae.
    }


}
