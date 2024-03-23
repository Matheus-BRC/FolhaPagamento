import java.util.ArrayList;

public class Folha {
    private ArrayList<Funcionario> funcionarios;

    public Folha(){
        funcionarios = new ArrayList<Funcionario>();
        addHorista("funcionario1", "123.456.789-01", 40, 50.00);
        addMensalista("funcionario2", "987.654.321-09", 3000.00);
    }

    public void addHorista(String nome, String cpf, double hora, double valorHora){
        funcionarios.add(new Horista(nome, cpf, hora, valorHora));
    }

    public void addMensalista(String nome, String cpf, double salarioFixo){
        funcionarios.add(new Mensalista(nome, cpf, salarioFixo));
    }

    public String getFolha(){
        String teste = "";
        for(Funcionario funcionario : funcionarios){
            teste += funcionario.getCpf();
            teste += funcionario.getNome();
            teste += funcionario.getTipo();
            teste += funcionario.getSalario();
        }
        return teste;
    }
    public double getSalarioTotal() {
        double salarioTotal = 0;
        for(Funcionario funcionario : funcionarios){
            salarioTotal += funcionario.getSalario();
        }
        return  salarioTotal;
    }
}
