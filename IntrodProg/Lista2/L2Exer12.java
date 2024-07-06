import java.util.Scanner;

public class L2Exer12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Comparador de números");

        System.out.println("Qual é o primeiro número?");
        double a = input.nextDouble();

        System.out.println("Qual é o segundo número?");
        double b = input.nextDouble();

        if (a == b) {
            System.out.println("Os dois número são iguais");
        } else {
            System.out.println("Os dois números são diferentes");
        }
    }
}
