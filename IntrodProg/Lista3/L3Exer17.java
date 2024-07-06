import java.util.Scanner;

public class L3Exer17 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);

        System.out.println("Descubra seu peso em outros planetas");
        System.out.printf("Escolha o planeta:%n1-Mercúrio%n2-Vênus%n3-Marte%n4-Júpiter%n5-Saturno%n6-Urano%n7-Netuno");
        System.out.println();
        char planet = leiador.next().charAt(0);

        System.out.println("Digite seu peso:");
        double peso = leiador.nextDouble();
        double npeso= 0;
        switch (planet) {
            case '1':
                npeso = peso*0.37;
                System.out.printf("Seu peso em Mercúrio é %.2fKg", npeso);
                break;
            
            case '2':
                npeso = peso*0.887;
                System.out.printf("Seu peso em Mercúrio é %.2fKg", npeso);
                break;

            case '3':
                npeso = peso*0.371;
                System.out.printf("Seu peso em Mercúrio é %.2fKg", npeso);
                break;

            case '4':
                npeso = peso*2.479;
                System.out.printf("Seu peso em Mercúrio é %.2fKg", npeso);
                break;

            case '5':
                npeso = peso*1.044;
                System.out.printf("Seu peso em Mercúrio é %.2fKg", npeso);
                break;

            case '6':
                npeso = peso*0.887;
                System.out.printf("Seu peso em Mercúrio é %.2fKg", npeso);
                break;

            case '7':
                npeso = peso*1.115;
                System.out.printf("Seu peso em Mercúrio é %.2fKg", npeso);
                break;
            default:
                System.out.println("Você deve digitar um valor entre 1 e 7");
                break;
        }
    }
}
