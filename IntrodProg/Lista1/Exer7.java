import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Relatório de vendas de picolés");

        System.out.println("Quantidade de picolés de uva:");
        double uva = scanner.nextDouble();

        System.out.println("Quantidade de picolés de chocolate:");
        double chocolate = scanner.nextDouble();

        System.out.println("Quantidade de picolés de morango:");
        double morango = scanner.nextDouble();

        scanner.close();

        double totaluva = 6*uva/4;
        double totalchocolate = chocolate*2;
        double totalmorango = 3*morango/4;

        double total = totalchocolate + totalmorango + totaluva;
        
        System.out.println("Os ganhos de picolé uva foram R$"+totaluva);
        System.out.println("Os ganhos de picolé chocolate foram R$"+totalchocolate);
        System.out.println("Os ganhos de picolé morango foram R$"+totalmorango);
        System.out.println("Total das vendas foi R$"+total);
    }
}
