import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double peso, engordar, emagrecer;

        System.out.println("Qual e o seu peso:");
        peso = input.nextDouble();

        engordar = peso *1.15;
        emagrecer = peso *0.8;

        System.out.println("Se voce engordar 15% seu peso sera de " + engordar + "Kg");
        System.out.println("Se voce emagrecer 20% seu peso sera de " + emagrecer + "Kg ");

    }
}
