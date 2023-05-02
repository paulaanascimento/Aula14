import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = entrada.nextDouble();

        System.out.println("Digite o total de vendas efetuadas por ele (em dinheiro): ");
        double totalVendas = entrada.nextDouble();

        double salarioFinal = calcularSalarioFinal(0.15, totalVendas, salarioFixo);

        System.out.println("------------------------------------");
        System.out.println("Funcionário : " + nome);
        System.out.println("Salário Fixo : " + salarioFixo);
        System.out.println("Salario final : " + salarioFinal);
    }

    public static double calcularSalarioFinal(double porcentagem, double totalVendas, double salarioFixo){
        return totalVendas * porcentagem + salarioFixo;
    }
}
