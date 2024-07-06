import java.util.Scanner;

public class bilhete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice = 'S';
        int qntinft=0,qntadult=0;

        System.out.println("BILHETERIA DO PARQUE DE DIVERÇÕES");
        do{
            System.out.println("Digite sua idade e lhe informamos seu tipo de bilete");
            int idade = scanner.nextInt();

            if(idade<6){
                System.out.println("Não precisa pagar");
            }
            else if(idade<=12){
                System.out.println("Deverá pagar no valor para criança");
                qntinft++;
            }
            else if(idade<65){
                System.out.println("Deverá pagar o valor normal do bilhete");
                qntadult++;
            }
            else if(idade>=65){
                System.out.println("Deverá pagar o valor para o bilhete de 3° idade");
                qntadult++;
            }
            System.out.println("Deseja conferir outra pessoa?(S/N)");
            choice = scanner.next().charAt(0);
        }
        while(Character.toUpperCase(choice)=='S');
        System.out.println("Foram vendidos "+qntinft+"bilhetes infantis e "+qntadult+" bilhates adultos");

    }
}
