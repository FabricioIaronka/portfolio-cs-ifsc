import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DE COMPRAS");

        System.out.println("Qual é o preço do café?");
        double pcafe = scanner.nextDouble();
        System.out.println("Quantos quilos de café?");
        double qcafe = scanner.nextDouble();
        double gastocafe = gasto(pcafe, qcafe);

        System.out.println("Qual o preço do leite?");
        double pleite = scanner.nextDouble();
        System.out.println("Quantos litros de leite?");
        double lleite = scanner.nextDouble();
        double gastoleite = gasto(pleite, lleite);

        System.out.println("Qual preço da bolacha?");
        double pbolacha = scanner.nextDouble();
        System.out.println("Quantos pacotes de bolacha?");
        double qbolacha = scanner.nextDouble();
        double gastobolacha = gasto(pbolacha, qbolacha);

        double gastototal = gastobolacha+gastocafe+gastoleite;
        
        System.out.println("O gasto total será de R$"+gastototal);
        System.out.println("Foi gasto em café R$"+gastocafe);
        System.out.println("Foi gasto em leite R$"+gastoleite);
        System.out.println("Foi gasto em bolacha R$"+gastobolacha);
    }
    public static double gasto(double preco,double quantidade){
        double total = preco*quantidade;
        return total;
    }
}
