import java.util.Scanner;

public class L3Exer4 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);
        System.out.println("Descubra se o número é ímpar ou par");
        
        System.out.println("Digite o número:");
        int n = leiador.nextInt();

        int rest = n%2;

        if(rest==0){
            System.out.println("Esse número é par");
        }
        else{
            System.out.println("Esse número é ímpar");
        }
    }
}
