import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
       
        System.out.println("Digite o horário (hh:mm:ss): ");
        String horas= input.nextLine();

        int tempo= converter(horas);

        System.out.println("Ainda faltam "+tempo+" segundos para terminar o dia.");
        
    }
    public static int converter(String hora){
        String[] horario = hora.split(":");
        int[] dhorario = new int[3];

        for(int i=0;i<3;i++){
            dhorario[i] = Integer.parseInt(horario[i]);
        }
        
        int tempo= 86400- ((dhorario[0] * 3600) + (dhorario[1] * 60) + dhorario[2]);
        return tempo;
    }
}