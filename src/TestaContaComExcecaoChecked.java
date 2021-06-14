public class TestaContaComExcecaoChecked {
    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();                        //sinaliza que o metodo deposita precisa de um tratamento.
        }catch (MinhaExcecao ex){
            System.out.println("Tratamento ....");
        }

    }

    //Funções checked servem para sinalizar para outros programadores que precisa realizar um tratamento naquele metodo,
}
