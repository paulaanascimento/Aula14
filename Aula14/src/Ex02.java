import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println(nomeUsuario());
    }

    public static String nomeUsuario(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = entrada.nextLine();

        return "Meu nome é " + nome;
    }
}
