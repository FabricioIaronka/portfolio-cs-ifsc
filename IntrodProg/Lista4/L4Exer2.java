import java.util.Scanner;

public class L4Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soma de dois valores com o segundo maior");
        System.out.println("Digite numero:");
        int n1= scanner.nextInt();
        System.out.println("Digite segundo numero:");
        int n2 = scanner.nextInt();


        while (n1>=n2){
            System.out.println("O segundo numero não pode ser maior que o primeiro, digite novamente:");
            n2 = scanner.nextInt();
        }
        int soma = n1+n2;
        System.out.println("A soma dos dois numeros é: "+soma);

    }
}
