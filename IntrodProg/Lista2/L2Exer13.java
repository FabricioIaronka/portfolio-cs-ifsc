import java.util.Scanner;

public class L2Exer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o valor de A?");
        double a = scanner.nextDouble();

        System.out.println("Qual é o valor de B?");
        double b = scanner.nextDouble();

        System.out.println("Qual é o valor de C?");
        double c = scanner.nextDouble();

        if (a + b < c) {
            System.out.println("A some de A com B é menor que C");
        } else if (a + b == c) {
            System.out.println("A soma de A com B é igual a C");
        } else {
            System.out.println("A soma de A com B é maior que C");
        }

    }

}
