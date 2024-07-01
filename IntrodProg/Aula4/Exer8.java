import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salário dos vendedores");
        System.out.println("Digite o salário mínimo: ");
        Double salmin = scanner.nextDouble();
        System.out.println("Digite quantos carros o vendedor vendeu:");
        double numvendas = scanner.nextDouble();
        System.out.println("Digite o valor total das vendas do vendedor:");
        double valorvendas = scanner.nextDouble();
        double sal = salmin*2 + 150*numvendas + 0.05*valorvendas;
        System.out.println("O salário deste vendedor esse mês será R$"+sal);
    }
}
