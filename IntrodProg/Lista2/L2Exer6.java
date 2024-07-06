import java.util.Scanner;

public class L2Exer6 {
     public static void main(String[] args) {

        double prova1, prova2, trabalho, frequencia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota da prova 1: ");
        prova1 = scanner.nextDouble();

        System.out.println("Insira a nota da prova 2: ");
        prova2 = scanner.nextDouble();

        System.out.println("Insira a nota do trabalho: ");
        trabalho = scanner.nextDouble();

        System.out.println("Insira a frequência: ");
        frequencia = scanner.nextDouble();

        if (trabalho >= 7 || trabalho < 7 && trabalho >=6 && frequencia >= 90) {

            if (prova1 >= 6 || prova2 >= 6) {
                if (frequencia >= 75) {
                    System.out.println("Foi aprovado");
                } else {
                    System.out.println("Não foi aprovado");
                }
            } else {
                System.out.println("Não foi aprovado");
            }
        } 
        else {
            System.out.println("Não foi aprovado");
        }
        
    }
}
