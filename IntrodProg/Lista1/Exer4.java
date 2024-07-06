import java.util.Scanner;
public class Exer4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora do quadrado da soma");

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        double result = somaq(num1, num2);

        System.out.println("O resultado é "+result);
    }
    public static double somaq(double n1,double n2){
        double result = Math.pow(n1+n2,2);
        return result;
    }
}
