import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
       
        System.out.println("Digite o horário (somente as horas): ");
        int horas= input.nextInt();
        System.out.println("Digite o horário (somente os minutos): ");
        int min= input.nextInt();
        System.out.println("Digite o horário (somente os segundos): ");
        int segundos= input.nextInt();
        int tempo= (horas * 3600) + (min * 60) + segundos;
        System.out.println("Já se passaram "+tempo+" segundos desde que o dia começou.");

    }
}
