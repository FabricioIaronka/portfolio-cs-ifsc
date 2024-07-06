import java.util.Scanner;

public class L2Exer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do candidato?");
        String nome = scanner.nextLine();

        System.out.println("Qual foi a nota dele(a) em Português?");
        double pt = scanner.nextDouble();

        System.out.println("Qual foi a nota dele(a) em Matemática?");
        double mt = scanner.nextDouble();

        System.out.println("Qual foi a nota dele(a) em Conhecimentos Gerais?");
        double cg = scanner.nextDouble();

        double media = (pt + mt + cg) / 3;

        System.out.println("O nome do candidato é " + nome);
        System.out.println("A sua nota em Português foi " + pt);
        System.out.println("A sua nota em Matemática foi " + mt);
        System.out.println("A sua nota em Conhecimentos Gerais foi " + cg);
        System.out.println("A sua média foi " + media);

        if (media >= 7 && pt > 5 && mt > 5 && cg > 5) {
            System.out.println("O candidato foi aprovado!");
        } else {
            System.out.println("O candidato foi reprovado!");
        }

    }

}
