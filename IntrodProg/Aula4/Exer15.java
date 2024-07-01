import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        double peso, engordar, emagrecer;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual e o seu peso:");
        peso = input.nextInt();
        engordar = peso *1.15;
        emagrecer = peso * 0.8;
        System.out.println("Seu peso sera: " + engordar + "kg se voce engordar 15%");
        System.out.println("Seu peso sera: " + emagrecer + "kg se voce emagrecer 20%");

    }
}
