public class MinhaExcecao extends Exception{ //pego os atributos e funcoes da RuntimeExcepetion

    public MinhaExcecao(String msg) {
        super(msg);               //repassando a string para a classe mae.
    }


}
