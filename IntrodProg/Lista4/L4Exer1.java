import java.util.Scanner;

public class L4Exer1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número:");
            double n1 = scanner.nextDouble();
            System.out.println("Digite um segundo número:");
            double n2 = scanner.nextDouble();

            if (n1 == n2) {
                System.out.println("Os números são iguais");
                break;
            } else {
                System.out.println("Os números são diferentes");
            }
        }
    }
}
