import java.util.Scanner;

public class L3Exer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Leitor de conta bancária");

        System.out.println("Digite o numero da sua conta: ");
        var conta = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        while (true) {

            System.out.println("Digite a operação que deseja realizar(1-deposito/2-saque)");
            char op = scanner.next().charAt(0);

            if (op == '1') {
                System.out.println("Quanto você deseja depositar?");
                double dep = scanner.nextDouble();

                double nsaldo = saldo + dep;
                System.out.println("Seu novo saldo agora é R$" + nsaldo);
                break;
            } 
            else if (op == '2') {
                System.out.println("Quanto você deseja sacar?");
                double saque = scanner.nextDouble();

                double nsaldo = saldo - saque;
                if (nsaldo < 0) {
                    System.out.println("Seu novo saldo é R$" + nsaldo + " e sua conta estourou");
                    break;
                } else {
                    System.out.println("Seu novo saldo é R$" + nsaldo);
                    break;
                }
            }
            else {
                System.out.println("Você deve digitar somente 1 ou 2");
            }
        }
    }
}
