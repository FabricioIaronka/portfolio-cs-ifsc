import java.util.Scanner;
public class Exer4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora do quadrado da soma");
        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        double result = (num1 + num2)*(num1+num2);
        System.out.println("O resultado é "+result);
    }
}
