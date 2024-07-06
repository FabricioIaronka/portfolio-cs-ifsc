import java.util.Scanner;

public class L3Exer18 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);

        System.out.println("Bônus de saldo médio");

        System.out.println("Digite seu saldo médio:");
        double saldom= leiador.nextDouble();

        if(saldom<500.01){
            System.out.println("Você não receberá nenhum bônus");
        }
        else {
            if(saldom<1000.01){
                saldom=saldom*1.3;
                System.out.print("Você recebe um bônus 30% do salário médio, ou seja, ");
                System.out.printf("R$ %.2f",saldom);
            }
            else{
                if(saldom<3000.01){
                    saldom=saldom*1.4;
                    System.out.print("Você recebe um bônus 40% do salário médio, ou seja, ");
                    System.out.printf(" R$%.2f",saldom);
                }
                else{
                    saldom=saldom*1.5;
                    System.out.print("Você recebe um bônus 50% do salário médio, ou seja, ");
                    System.out.printf(" R$%.2f",saldom);
                }
            }
        }
    }
}
