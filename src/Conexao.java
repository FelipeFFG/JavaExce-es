public class Conexao implements AutoCloseable{    //AutoCloseable realiza o finally de maneira implicita com a funcao close();

    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException();    //desta forma o objeto nao consegue ser criado, sendo assim nao se realiza o close() na funcao, e nem a leDados.
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override
    public void close(){
        System.out.println("Fechando conexao");
    }
}