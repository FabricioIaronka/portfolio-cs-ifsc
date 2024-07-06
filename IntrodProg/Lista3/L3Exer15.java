import java.util.Scanner;

public class L3Exer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Classificação de nadadores");

        System.out.println("Digite a idade do nadador");
        int idade = scanner.nextInt();
        if (idade > 4) {
            if (idade < 11) {
                System.out.println("O nadador é classificado como Infantil");
                
            }
            else{
                if (idade < 18  ) {
                    System.out.println("O nadador é classificado como Juvenil");
                    
                }
                else{
                    if (idade < 60) {
                        System.out.println("O nadador é classificado como Adulto");
                    }
                    else{
                        System.out.println("O nadador é classificado como Sênior");
                    }
                }
            }
        }
        else{
            System.out.println("Este nadador não entra na classficação");
        }
    }
}
