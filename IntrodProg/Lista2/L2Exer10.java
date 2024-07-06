import java.util.Scanner;

public class L2Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de verificação para decolagem ");

        System.out.println("Digite o tamanho da pista(quilometros):");
        double pista = scanner.nextDouble();

        System.out.println("Digite o peso do avião(toneladas): ");
        int peso = scanner.nextInt();

        System.out.println("Digite a visibilidade da pista(metros): ");
        int visibilidade = scanner.nextInt();

        System.out.println("Digite a precipitação, caso não esteja chovendo digite 0 (em mm):");
        int precipitacao = scanner.nextInt();

        System.out.println("Digite a quantidade de passageiros no avião: ");
        int passageiros = scanner.nextInt();

        System.out.println("Digite se o avião possue sistema de decolagem(s/n):");
        char sistdecola = scanner.next().charAt(0);
        scanner.nextLine();

        // caso precipitacao maior que 5mm nenhum decola
        boolean d1 = precipitacao <= 5;
        //caso tenha mais de 100 passageiros e esteja chovendo não pode decolar
        boolean d2 = !(passageiros > 100 && precipitacao >0);
        // caso visibilidade<20 com sistema de decolagem pode decolar
        boolean d3 = !(visibilidade < 20 && sistdecola == 'n');
        // caso 1,5km peso < 40t ou caso 2km peso <= 60t ou caso pista> 2 qualquer peso
        boolean d4 = pista < 1.5 && peso < 40 || pista <= 2 && peso <= 60 || pista>2;
                 
        if(d1 && d2 && d3 && d4){
            System.out.println("O avião poderá decolar");
        }
        else{
            System.out.println("O avião não pode decolar");
        }
    }
}
