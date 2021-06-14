package ConteudosAulas123;

//abstract esta relacionado com herança, sendo algo abstrado nao sendo possivel criar um objeto do tipo funcionario.
public abstract class Funcionario  {



    private String nome;
    private String cpf;
    private double salario; //publico para os filhos.


    //metodo sem corpo, nao há implementação
    public abstract double getBonificacao();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
