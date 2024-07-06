import java.util.Scanner;

public class L2Exer17 {
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalParcelas, parcelasPagas;
        double valorParcela, saldoDevedor, totalPago, valorTotal;

        System.out.println("Insira o total de parcelas do consórcio: ");
        totalParcelas = scanner.nextInt();

        System.out.println("Insira o valor das parcelas: ");
        valorParcela = scanner.nextDouble();

        System.out.println("Insira a quantidade de parcelas pagas: ");
        parcelasPagas = scanner.nextInt();

        valorTotal = totalParcelas * valorParcela;
        totalPago = valorParcela * parcelasPagas;
        saldoDevedor = valorTotal - totalPago;
        
        System.out.println("Total pago: "+totalPago);
        System.out.println("Saldo devedor: "+saldoDevedor);
    }

}
