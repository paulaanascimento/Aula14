import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
       int soma = somarNumero();
        System.out.println("O resultado final da somatória é: " + soma);
    }

    public static int somarNumero(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = entrada.nextInt();

        int soma = 0;

        for(int i = 1; i <= numero; i++){
            soma = soma + i;
        }

        return soma;
    }
}
