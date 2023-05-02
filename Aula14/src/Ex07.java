import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a cotação atual do dólar: ");
        double cotacao = entrada.nextDouble();

        System.out.println("Digite a quantidade de dólares: ");
        double quantidade = entrada.nextDouble();

        coverterDolarParaReal(quantidade, cotacao);
    }

    public static double coverterDolarParaReal(double valorDolar, double cotacao){
        double real = cotacao * valorDolar;

        System.out.println("O valor convertido para reais é: " + real);

        return real;
    }
}
