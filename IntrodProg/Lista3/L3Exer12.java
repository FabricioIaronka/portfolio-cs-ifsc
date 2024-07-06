import java.util.Scanner;

public class L3Exer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Classificador de ângulos");

        System.out.println("Digite o ângulo:");
        int a = scanner.nextInt();

        if (a > 180) {
            System.out.println("Este ângulo é grande de mais");
        } 
        else if(a<0){
            System.out.println("O ângulo não pode ser negativo");
        }
        else {
            if (a < 90) {
                System.out.println("Esse ângulo é agudo");
            } else if (a == 90) {
                System.out.println("Esse ângulo é reto");
            } else {
                System.out.println("Esse ângulo é obtuso");
            }
        }
    }
}
