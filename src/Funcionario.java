public class Funcionario {

    private String nome;
    private String cpf;
    private String tipo;

    public Funcionario(String nome, String cpf, String tipo){
        setNome(nome);
        setCpf(cpf);
        setTipo(tipo);
    }

    private void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    private void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public double getSalario(){
        return 0;
    }

}
