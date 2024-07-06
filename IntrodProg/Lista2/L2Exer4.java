import java.util.Scanner;

public class L2Exer4{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
            System.out.println("Calculadora de IMC");

            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.print("Digite seu peso: ");
            double peso = scanner.nextDouble();

            double imc = peso/(altura * altura);
            
            if (imc > 25) {
                System.out.printf("Seu IMC é :%.1f%n",imc);
                System.out.println("Você está acima do peso ideal");
            }
            else if (imc < 18.5) {
                System.out.printf("Seu IMC é :%.1f%n",imc);
                System.out.println("Você está abaixo do peso ideal");
            }
            else{
            System.out.printf("Seu IMC é: %.1f%n", imc);
            System.out.print("Você está no peso ideal"); 
            }
    }
}