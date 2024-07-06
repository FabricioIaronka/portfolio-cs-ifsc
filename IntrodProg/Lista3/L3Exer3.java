import java.util.Scanner;

public class L3Exer3 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);

        System.out.println("Calculadora de IMC");

            System.out.print("Digite sua altura: ");
            double altura = leiador.nextDouble();

            System.out.print("Digite seu peso: ");
            double peso = leiador.nextDouble();

            double imc = peso/(altura * altura);
            String situacao;


            if (imc < 20) {
                situacao = "Magro";
            }
            else{
                if (imc <24.99){
                    situacao ="Normal"; 
                }
                else{
                    if(imc <30){
                        situacao="Sobrepeso";
                    }
                    else{
                        situacao="Obeso";
                    }
                }
            }
            System.out.printf("Seu IMC é: %.2f%n",imc);
            System.out.println("Sua situação: "+situacao);

    }
}
