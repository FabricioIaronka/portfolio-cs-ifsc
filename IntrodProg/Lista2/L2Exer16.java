import java.util.Scanner;

public class L2Exer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual era o preço da mercadoria A no dia 01/01/2022?");
        double a = scanner.nextDouble();

        System.out.println("Qual era o preço da mercadoria B no dia 01/01/2022?");
        double b = scanner.nextDouble();

        System.out.println("Qual era o preço da mercadoria C no dia 01/01/2022?");
        double c = scanner.nextDouble();

        System.out.println("Qual era o preço da mercadoria A no dia 01/02/2022?");
        double a2 = scanner.nextDouble();

        System.out.println("Qual era o preço da mercadoria B no dia 01/02/2022?");
        double b2 = scanner.nextDouble();

        System.out.println("Qual era o preço da mercadoria C no dia 01/02/2022?");
        double c2 = scanner.nextDouble();

        double infla = (((a2 - a) / a * 100) + ((b2 - b) / b * 100) + ((c2 - c) / c * 100)) / 3;

        if (infla > 0.55) {
            System.out.println("A inflação está acima da meta");
        } else {
            System.out.println("A inflação está dentro da meta");
        }

    }

}
