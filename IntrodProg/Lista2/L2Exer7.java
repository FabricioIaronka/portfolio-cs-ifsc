import java.util.Scanner;

public class L2Exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a altura da sala?");
        double alt = scanner.nextDouble();

        System.out.println("Qual é o comprimento da sala?");
        double comp = scanner.nextDouble();

        System.out.println("Qual é a largura da sala?");
        double larg = scanner.nextDouble();

        double piso = comp * larg;
        System.out.println("A área do piso é de " + piso + " metros quadrados.");

        double volume = alt * comp * larg;
        System.out.println("O volume da sala é de " + volume + " metros cúbicos.");

        double paredes = (alt * comp * 2) + (alt * larg * 2);
        System.out.println("A áres das paredes é de " + paredes + " metros quadrados");

        if (volume < 100) {
            System.out.println("O ar-condicionado deverá ser pequeno.");
        } else if (volume >= 100 && volume <= 500) {
            System.out.println("O ar-condicionado deverá ser médio.");
        } else {
            System.out.println("O ar-condicionado deverá ser grande.");
        }
    }
}
