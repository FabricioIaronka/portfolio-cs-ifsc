import java.util.Scanner;

public class L2Exer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a distância a ser percorrida em Km?");
        double dist = scanner.nextDouble();

        System.out.println("Qual é o consumo médio do carro em Km/litro?");
        double cons = scanner.nextDouble();

        System.out.println("Qual é o preço do litro do combustível?");
        double preco = scanner.nextDouble();

        double litro = dist / cons;
        double gasto = litro * preco;

        System.out.println("O valor a ser gasto com combustível na viagem será de R$" + gasto);
    }
}
