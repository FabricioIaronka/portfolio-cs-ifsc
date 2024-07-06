import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        System.out.println("João recebeu seu salário de R$1500,00 mas terá que pagar duas contas atrasadas, uma de R$200 e outra de R$120 com 2%");
       
        double salario= 1500.00;
        double c1= 200.00;
        double c2= 120.00;
        double x= salario - ((c1 * 1.02) + (c2 * 1.02));
        System.out.println("Sobrará R$ "+x+" do salário do João");

    }
}
