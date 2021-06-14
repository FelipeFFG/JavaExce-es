package ConteudosAulas123;

//contrato Autenticavel
    //quem assina esse contrato, precisa implemetar
        //metodo setSenha
        //metodo autentica
public abstract interface Autenticavel {  //interface é uma classe abstrata com todas as classes abstratas


    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
