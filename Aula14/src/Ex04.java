import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja digitar:");
        int quantidade = entrada.nextInt();

        int[] numeros = new int[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.println("Digite o " + (i+1) + " número");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("O menor número é " + menorNumero(numeros));
    }

    public static int menorNumero(int[] numeros){
        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if( numeros[i] < menor){
                menor = numeros[i];
            }
        }

        return menor;
    }
}
