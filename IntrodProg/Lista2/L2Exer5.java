import java.util.Scanner;

public class L2Exer5 {
     public static void main(String[] args) {
        double prova1, prova2, trabalho, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de média");

        System.out.println("Insira a nota da prova 1: ");
        prova1 = scanner.nextDouble();

        System.out.println("Insira a nota da prova 2: ");
        prova2 = scanner.nextDouble();

        System.out.println("Insira a nota do trabalho: ");
        trabalho = scanner.nextDouble();

        media = prova1 + prova2 + trabalho;
        media = media / 3;

        if (media >= 7) {
            System.out.println("Foi aprovado");
        } else {
            System.out.println("Não foi aprovado");
        }

    }
}
