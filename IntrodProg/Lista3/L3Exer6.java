import java.util.Scanner;

public class L3Exer6 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);

        System.out.println("Descubra qual é menor número:");

        System.out.println("Digite primeiro número:");
        int n1 = leiador.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = leiador.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3 = leiador.nextInt();

        int menor1 = Math.min(n1,n2);
        int menor2 = Math.min(menor1,n3);
        System.out.println("O menor número é "+menor2);
    }
}
