import java.util.Scanner;

public class L4Exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option='S';

        do{
        System.out.println("HOTEL");
        System.out.println("Nome do hóspede:");
        String nome = scanner.nextLine();

        System.out.println("Tipo do apartamento:");
        char type = scanner.next().charAt(0);

        System.out.println("Quantas diárias ira ficar:");;
        int diarias = scanner.nextInt();
        if(diarias<=0){
            System.out.println("O numero de diárias deve ser maior que 0");
            continue;
        }

        double valor = 0;
        switch (type) {
            case 'A':
                valor=150;
                break;

            case 'B':
                valor=100;
                break;

            case 'C':
                valor = 75;
                break;

            default:
                System.out.println("Caracter inválido, deve ser A ou B ou C");
                continue;
                
        }
        double valortotal= valor*diarias;

        System.out.println("O hóspede "+nome+" ficará no apto tipo "+type+" por "+diarias+" dias e o valor total será de R$"+valortotal);

        System.out.println("Deseja cadastrar outro cliente?(S/N)");
        option = scanner.next().charAt(0);
        scanner.nextLine();

        }
        while(Character.toUpperCase(option) =='S');
    }
}
