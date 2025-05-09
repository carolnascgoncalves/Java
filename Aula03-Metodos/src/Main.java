public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Amandha";
        funcionario.cargo = "Vendedor";
        funcionario.salario = 30000;

        System.out.println("Bonus: "+funcionario.calcularBonus());
        System.out.println("Gratificação: "+funcionario.calcularGratificacao());
        System.out.println("IRPF: "+funcionario.calcularIRPF());
    }
}