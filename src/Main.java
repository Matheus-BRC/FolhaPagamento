import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StringBuilder dado = new StringBuilder();
        Folha folha = new Folha();
        ArrayList<Funcionario> funcionarios = folha.getFolha();

        folha.addHorista("funcionario1", "123.456.789-01", 40, 50.00);
        folha.addMensalista("funcionario2", "987.654.321-09", Cargo.Estagiario);
        folha.addMensalista("funcionario3", "789.654.321-87", Cargo.Desenvolvedor);
        folha.addHorista("funcionario4", "543.210.789-53", 30, 40.00);

        System.out.println("\nFOLHA DE PAGAMENTO \n");
        System.out.println("CPF \t\t\t\t\t NOME \t\t\t\t\t TIPO \t\t\t\t\t SALARIO \t\t\t\t R$(HORA)");

        for(Funcionario funcionario : funcionarios){
            dado.append(funcionario.getCpf());
            dado.append("\t\t\t ");
            dado.append(funcionario.getNome());
            dado.append("\t\t\t ");
            dado.append(funcionario.getTipo());
            dado.append("\t\t\t\t ");
            dado.append(funcionario.getSalario());
            dado.append("\t\t\t\t\t ");
            dado.append(funcionario.getValorHora());
            dado.append("\n");
        }

        System.out.println(dado.toString());
        System.out.println("TOTAL: " + folha.getSalarioTotal());
    }
}