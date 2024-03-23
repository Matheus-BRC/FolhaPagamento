public class Main {
    public static void main(String[] args) {

        System.out.println("\nFOLHA DE PAGAMENTO\n");

        Folha folha = new Folha();

        System.out.println("CPF \t\t\t\t NOME \t\t\t\t TIPO \t\t\t\t SALARIO");

        System.out.println(folha.getFolha());

        System.out.println("TOTAL: " + folha.getSalarioTotal());

        //            System.out.print(funcionario.getCpf() + " \t\t ");
        //            System.out.print(funcionario.getNome() + " \t\t ");
        //            System.out.print(funcionario.getTipo() + " \t\t\t ");
        //            System.out.print(funcionario.getSalario() + " \n");
    }
}