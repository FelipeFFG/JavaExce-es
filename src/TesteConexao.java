public class TesteConexao {
    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){   //Como a classe Conexao implemets AutoClosable , nao precisa realizar o finally,ja que o finally() acaba sendo implicito
            conexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Deu erro na conexao");
        }



        //--------------------------------

       /* Conexao con = null;
        try {                                                //um try sempre vem acompanhado de um ou mais catch() ou um finally() ou Ambos.
            con = new Conexao();
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            if (con != null) {
                con.close();
            }
        }*/


    }
}
