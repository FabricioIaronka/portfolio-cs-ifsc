import java.util.Scanner;

public class L2Exer8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora de distancia de raios ");

        System.out.println("Digite o tempo que se passou entre que viu o raio e escutou seu barulho: ");
        double tempo = scanner.nextDouble();

        double dist = tempo * 340;
        System.out.println("Você está a " + dist + "m do raio.");
        if (dist < 200) {
            System.out.println("Alerta!! Voce esta a uma distancia de risco do raio! 200m ou menos.");
        }
    }

}
