import java.util.Scanner;

public class L3Exer8 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);

        System.out.println("Ajustes de salário");

        System.out.println("Digite o nome do funcionário:");
        String fun = leiador.nextLine();

        System.out.println("Digite a categoria do funcionário:");
        char cat = leiador.next().charAt(0);

        System.out.println("Digite o sálario atual: ");
        double sal = leiador.nextDouble();

        double nsal = 0;

        switch (cat) {
            case 'A':
                nsal= sal*1.1;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;

            case 'B':
                nsal= sal+sal*0.15;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;
            
            case 'C':
                nsal= sal+sal*0.25;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;

            case 'D':
                nsal = sal+sal*0.15;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;
            
            case 'E':
                nsal= sal+sal*0.15;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;

            case 'F':
                nsal= sal+sal*0.25;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;

            case 'H':
                nsal= sal*1.1;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;

            default:
                nsal= sal*1.3;
                System.out.println("O funcionário "+fun+" da categoria "+cat+" terá seu sálario aumentado para R$"+nsal);
                break;
        }
    }
}
