package ConteudosAulas123;

public class TesteSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(222);

        SistemaInterno sistema = new SistemaInterno();
        sistema.autentica(g);
        sistema.autentica(adm);
        sistema.autentica(cliente);

    }
}
