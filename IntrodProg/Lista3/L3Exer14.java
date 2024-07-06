import java.util.Scanner;

public class L3Exer14 {
    public static void main(String[] args) {
        Scanner スキャナー = new Scanner(System.in);

        System.out.println("Descubra seu peso ideal");
        ;

        while (true) {
            System.out.println("Digite seu genêro biológico(M-Masculino ou F-Feminino):");
            char gen = スキャナー.next().charAt(0);

            System.out.println("Digite sual altura");
            double altura = スキャナー.nextDouble();

            if (gen == 'M' || gen == 'm') {
                double peso = 72.7 * altura - 58;
                System.out.printf("Seu peso ideal é %.2fKg", peso);
                break;
            } else if (gen == 'F' || gen == 'f') {
                double peso = 62.1 * altura - 44.7;
                System.out.println("Seu peso ideal é " + peso + "Kg");
                break;
            } else {
                System.out.println("Você digitou caracter errado para o genêro");
            }
        }
    }

}
