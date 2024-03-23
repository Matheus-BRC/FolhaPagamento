public class Horista extends Funcionario{

    private double hora;
    private double valorHora;

    public Horista(String nome, String cpf, double hora, double valorHora){
        super(nome, cpf, "Horista");
        setHora(hora);
        setValorHora(valorHora);
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getHora() {
        return hora;
    }

    private void setValorHora(double valorHora) {
        if(valorHora <= 0) throw new IllegalArgumentException("Valor Inválido");
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getSalario() {
        return getValorHora() * getHora();
    }
}
