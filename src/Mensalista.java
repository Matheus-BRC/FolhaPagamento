public class Mensalista extends Funcionario{

    private String cargo;
    private double salarioFixo;

    public Mensalista(String nome, String cpf, double salarioFixo){
        super(nome, cpf, "Mensalista");
        setSalarioFixo(salarioFixo);
    }

    private void setSalarioFixo(double salarioFixo){
        this.salarioFixo = salarioFixo;
    }

    public double getSalario() {
        return salarioFixo;
    }
}
