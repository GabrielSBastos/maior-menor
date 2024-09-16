import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numeroUm = numero.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numeroDois = numero.nextInt();

        if (numeroUm == numeroDois) {
            System.out.println("Os números são iguais");
        } else if (numeroUm > numeroDois) {
            System.out.println("O número um é maior");
        } else {
            System.out.println("O número dois é maior");
        }
    }
}
