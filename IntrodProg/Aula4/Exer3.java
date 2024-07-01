import java.util.Scanner;
public class Exer3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de soma de quadrados");
        System.out.println("Digite primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite segundo numero: ");
        double num2 = scanner.nextDouble();
        double result = num1*num1 + num2*num2;
        System.out.println("O resultado é "+result);
    }
}