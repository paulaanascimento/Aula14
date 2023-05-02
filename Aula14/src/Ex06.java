import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = entrada.nextDouble();

        double temperaturaFahrenhit = converterTemperaturaFahrenheit(temperaturaCelsius);

        System.out.println("A temperatura convertida em graus Fahrenheit é: " + temperaturaFahrenhit);
    }

    public static double converterTemperaturaFahrenheit(double temperaturaCelsius){
        return (9 * temperaturaCelsius + 160)/5;
    }
}
