public class Mensalista extends Funcionario{

    private Cargo cargo;
    private double salarioFixo;

    public Mensalista(String nome, String cpf, Cargo cargo){
        super(nome, cpf, "Mensalista");
        setCargo(cargo);
        setSalarioFixo();
    }

    private void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    private void setSalarioFixo(){
        if(cargo == Cargo.Desenvolvedor) this.salarioFixo = 7000;
        if(cargo == Cargo.Estagiario) this.salarioFixo = 1500;
        if(cargo == Cargo.Tecnico) this.salarioFixo = 4000;
    }

    public double getSalario() {
        return salarioFixo;
    }
}
