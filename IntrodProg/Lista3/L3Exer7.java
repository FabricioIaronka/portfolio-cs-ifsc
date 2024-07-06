import java.util.Scanner;
import java.util.Arrays;

public class L3Exer7 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);

        System.out.println("Organizador de números em ordem crescente:");

        System.out.println("Digite primeiro número:");
        int n1 = leiador.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = leiador.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3 = leiador.nextInt();

        int[] nums = {n1,n2,n3};
        Arrays.sort(nums);

        System.out.println("Números em ordem crescente:");
        for (int num : nums){
            System.out.print(num+" ");
        }
    }
}
