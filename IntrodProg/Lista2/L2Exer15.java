import java.util.Scanner;

public class L2Exer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salario bruto: ");
        double salbru = scanner.nextDouble();

        System.out.println("Digite o numero de dependentes que voce possui: ");
        int depen = scanner.nextInt();

        double imposto = 0.74;
        double salliq = salbru * imposto;
        double ganho = depen * 150;

        System.out.println("O seu salario liquido é de R$" + salliq + ", você ganha um bônus de R$" + ganho + " por conta dos dependentes.");
    }

}
