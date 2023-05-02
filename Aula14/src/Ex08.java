import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço de custo: ");
        double precoCusto = entrada.nextDouble();

        System.out.println("Digite o percentual para acréscimo: ");
        double percentual = entrada.nextDouble();

        calcularValorVenda(precoCusto, percentual);
    }

    private static double calcularValorVenda(double precoCusto, double percentual) {
        double valorVenda = precoCusto + precoCusto * percentual;

        System.out.println("O valor de venda é: " + valorVenda);

        return valorVenda;
    }
}
