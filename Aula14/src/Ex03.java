import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o peso:");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura:");
        double altura = entrada.nextDouble();

        calcularIMC(peso, altura);
    }

    public static void calcularIMC(double peso, double altura){
        double imc = peso/(altura * altura);

        if(imc < 18.5){
            System.out.println("Magreza");
        } else if((imc >= 18.5) && (imc <= 24.9)){
            System.out.println("Normal");
        } else if((imc >= 25.0) && (imc <= 29.9)){
            System.out.println("Sobrepeso");
        } else if((imc >= 30.0) && (imc <= 39.9)){
            System.out.println("Obesidade");
        } else System.out.println("Obsidade Grave");
    }
}
