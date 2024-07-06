import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Calculadora de quociente e resto de divisão por 2");

        System.out.println("Digite um número para ser dividido por 2:");
        int num= input.nextInt();
        
        double x= num / 2;
        double y= num % 2;
        System.out.println("O quociente da divisão é: "+x+" e o resto é: "+y);
    }
}
