import java.util.Scanner;
public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de área e perímetro de um retângulo");
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();
        double area = altura*largura;
        double perimetro = 2*altura + 2*largura;
        System.out.println("A área é "+area);
        System.out.println("O perímetro é "+perimetro);
    }
    
}
