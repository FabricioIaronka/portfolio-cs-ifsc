import java.util.Scanner;

public class L3Exer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantificador de produtos");

        System.out.println("Digite do nome do primeiro produto");
        String prod1 = scanner.nextLine();

        System.out.println("Digite a quantidade destes produtos");
        int qntprod1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite do nome do segundo produto");
        String prod2 = scanner.nextLine();

        System.out.println("Digite a quantidade destes produtos");
        int qntprod2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite do nome do terceiro produto");
        String prod3 = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Digite a quantidade destes produtos");
        int qntprod3 = scanner.nextInt();

        if (qntprod1 < 30 || qntprod2 < 30 || qntprod3 < 30) {
            if (qntprod1 < 30) {
                System.out.println("O produto " + prod1 + " está com pouco estoque");
            }
            else{
                System.out.println("O produto "+prod1+" está dentro dos limites de estoque");
            }

            if (qntprod2 < 30) {
                System.out.println("O produto " + prod2 + " está com pouco estoque");
            }
            else{
                System.out.println("O produto "+prod2+" está dentro dos limites de estoque");
            }

            if (qntprod3 < 30) {
                System.out.println("O produto " + prod3 + " está com pouco estoque");
            }
            else{
                System.out.println("O produto "+prod3+" está dentro dos limites de estoque");
            }

        }
        else{
            System.out.println("Todos os produtos estão dentro do limite de estoque");
        }
    }
}
