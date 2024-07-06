import java.util.Scanner;

public class L2Exer9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculador de troco");

        System.out.println("Digite o valor da compra: ");
        double compra = input.nextDouble();

        System.out.println("Digite o valor pago pelo cliente: ");
        double pago = input.nextDouble();

        System.out.println("A compra foi de: R$" + compra + ", o valor pago foi: R$" + pago);

        if (pago < compra) {
            System.out.println("O valor pago pelo cliente é insuficiente.");
        } 
        else if(pago == compra){
            System.out.println("Valor de compra exato, não necessita de troco");
        }
        else {
            double troco = pago - compra;
            int moeda1, cedula10, cedula100;

            cedula100 = (int) troco / 100;
            troco -= cedula100 * 100;
            cedula10 = (int) troco / 10;
            troco -= cedula10 * 10;
            moeda1 = (int) troco;
            System.out.println("O troco dado ao cliente será de R$"+troco);
            System.out.println("O que resulta em "+cedula100 + " cedulas de R$100, " + cedula10 + " cedulas de R$10, e " + moeda1 + " moedas de R$1.");
        }
    }
}
