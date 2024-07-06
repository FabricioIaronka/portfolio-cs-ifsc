import java.util.Scanner;

public class L3Exer5 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);
        System.out.println("Classificador de números");

        System.out.println("Digite um número: ");
        int n = leiador.nextInt();

        if(n<=10){
            System.out.println("F1");
        }
        else if(n>100){
            System.out.println("F3");
        }
        else{
            System.out.println("F2");
        }
    }
}
