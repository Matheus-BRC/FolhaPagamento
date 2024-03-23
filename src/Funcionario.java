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
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void setCpf(String cpf){
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("CPF inválido");
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    private void setTipo(String tipo){
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Tipo inválido");
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public double getSalario() {
        return 0;
    }

    public double getValorHora() {
        return 0;
    }

}
