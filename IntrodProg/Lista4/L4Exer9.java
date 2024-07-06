import java.util.Scanner;

public class cpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora do imposto de renda");
        System.out.println("digite CPF 00 para fechar");
        String cpf = "";
        String close = "00";
        int result =0;
        while(true) {

            System.out.println("Digite seu cpf:");
            cpf = scanner.nextLine();

            result = cpf.compareTo(close);
            if(result==0){
                break;
            }

            System.out.println("Digite sua renda:");
            double renda = scanner.nextDouble();

            System.out.println("Digite sua classe de renda:");
            char classe = scanner.next().charAt(0);
            scanner.nextLine();

            double desconto = 0;
            String qntdisc = "";

            switch (classe) {
                case 'A':
                    qntdisc="Isento";
                    break;

                case 'B':
                    desconto=0.05;
                    qntdisc="5%";
                    break;

                case 'C':
                    desconto=0.1;
                    qntdisc="10%";
                    break;

                case 'D':
                    desconto=0.15;
                    qntdisc="15%";
                    break;

                case 'E':
                    desconto=0.2;
                    qntdisc="20%";
                    break;

                default:
                    System.out.println(" A classe só pode ser A,B,C,D ou E");
                    continue;
            }

            double valordesc = renda*desconto;

            System.out.println("Você receberá "+qntdisc+" de desconto, o que vale a R$"+valordesc);

        } 
    }
}
