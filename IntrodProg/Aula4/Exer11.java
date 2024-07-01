import java.util.Scanner;

public class Exer11 {
 public static void main(String[] args) {
    int hora, s_total, horas, minutos, segundos;
        
    Scanner input = new Scanner(System.in);
    System.out.println("Olá bem vindo a calculadora de conversão de segundos em horas...");
    System.out.println("Digite o tempo em segundos a ser convertido:");
    s_total = input.nextInt();
    horas = s_total / 3600;
    minutos = (s_total % 3600)/ 60;
    segundos = s_total % 60;
    System.out.println("O tempo do video convertido e: "+horas+"h"+minutos+"m"+segundos+"s");

 }   
}
