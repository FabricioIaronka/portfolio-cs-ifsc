import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversora de Celsius para Farenheit");

        System.out.println("Digite a temperatura em Celsius: ");
        double temp = scanner.nextDouble();

        double fahren = temp*9/5+32;
        
        System.out.println("Essa temperatura em Fahrenheit é: "+fahren);
    }
}
