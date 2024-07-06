import java.util.Scanner;

public class L3Exer2 {
    public static void main(String[] args) {
        double prova1, prova2, trabalho;

        Scanner leiador = new Scanner(System.in);

        System.out.println("Insira a nota da prova 1: ");
        prova1 = leiador.nextDouble();

        System.out.println("Insira a nota da prova 2: ");
        prova2 = leiador.nextDouble();

        System.out.println("Insira a nota do trabalho: ");
        trabalho = leiador.nextDouble();

        if (trabalho >= 7 && prova1 >= 6 || trabalho >= 7 && prova2 >= 6) {
            System.out.println("Parabéns, você foi aprovado");
        } 
        else {
            System.out.println("Infelizmente, você não foi aprovado");
        }
    }
}
