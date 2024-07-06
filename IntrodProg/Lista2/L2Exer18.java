import java.util.Scanner;

public class L2Exer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de dias desde o nascimento");

        System.out.println("Digite o dia do seu nascimento: ");
        int dianasc = scanner.nextInt();

        System.out.println("Digite o mês do seu nascimento: ");
        int mesnasc = scanner.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int anonasc = scanner.nextInt();

        System.out.println("Digite o atual dia: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o atual mês: ");
        int mes = scanner.nextInt();

        System.out.println("Digite o atual ano: ");
        int ano = scanner.nextInt();

        int totalano = ano - anonasc -1;
        int totalmeses = 12-mesnasc + (mes)+totalano*12;
        int totaldias = 30-dianasc + dia + totalmeses*30;

        System.out.println("Se passaram "+totaldias+"dias desde seu nascimento");
    }
}
