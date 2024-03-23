import java.util.ArrayList;

public class Folha {
    private final ArrayList<Funcionario> funcionarios;

    public Folha(){
        funcionarios = new ArrayList<Funcionario>();
    }

    public void addHorista(String nome, String cpf, double hora, double valorHora){
        funcionarios.add(new Horista(nome, cpf, hora, valorHora));
    }

    public void addMensalista(String nome, String cpf, Cargo cargo){
        funcionarios.add(new Mensalista(nome, cpf, cargo));
    }

    public ArrayList<Funcionario> getFolha(){
        return funcionarios;
    }
    public double getSalarioTotal() {
        double salarioTotal = 0;
        for(Funcionario funcionario : funcionarios){
            salarioTotal += funcionario.getSalario();
        }
        return  salarioTotal;
    }
}
