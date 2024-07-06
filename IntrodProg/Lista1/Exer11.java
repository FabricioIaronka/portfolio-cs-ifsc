import java.util.Scanner;

public class Exer11 {
 public static void main(String[] args) {
    int segtotal, horas, minutos, segundos;
        
    Scanner input = new Scanner(System.in);

    System.out.println("Calculadora de conversão de segundos em horas");
    
    System.out.println("Digite o tempo em segundos a ser convertido:");
    segtotal = input.nextInt();

    horas = segtotal / 3600;
    minutos = (segtotal % 3600)/ 60;
    segundos = segtotal % 60;

    System.out.println("O tempo do video convertido e: "+horas+"h"+minutos+"m"+segundos+"s");

 }   
}
