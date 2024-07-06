import java.util.Scanner;

public class L2Exer2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora de consumo");

        System.out.println("Insira o valor de KwH consumida: ");
        double kw = scanner.nextDouble();

        System.out.println("Digite o preço do KwH: ");
        double preco = scanner.nextDouble();

        double total = kw * preco;
        double juro = total * 0.1 + total;

        System.out.println("O preco a ser pago e R$"+ total+ ", caso pague atrasado terá 10% de juros totalizando em R$"+ juro);
        
    }

}
