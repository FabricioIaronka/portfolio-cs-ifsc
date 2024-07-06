import java.util.Scanner;

public class L3Exer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicione um segundo ao horário");

        System.out.println("Digite as horas(0 a 23)");
        int hora = scanner.nextInt();

        System.out.println("Digite os minutos(0 a 59)");
        int minuto = scanner.nextInt();

        System.out.println("Digite os segundos(0 a 59)");
        int segundo = scanner.nextInt();

        segundo++;

        if(segundo>=60){
            segundo= segundo - 60;
            minuto++;
            if(minuto>=60){
                minuto= minuto -60;
                hora++;
                if (hora>=24) {
                    hora=hora-24;
                }
            }
        }

        System.out.println("O novo horário é "+hora+":"+minuto+":"+segundo);
    }
    
}
