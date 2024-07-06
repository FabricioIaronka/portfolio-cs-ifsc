import java.util.Scanner;


public class L4Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char gen = 'a';
        String nome = "a";
        int idade = 0,repcount = 0;
        
        do{
            System.out.println("Digite seu nome:");
            nome = scanner.nextLine();


            System.out.println("Digite seu genero biologico(M/F):");
            gen = scanner.next().charAt(0);
            
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();
            scanner.nextLine();
            repcount++;
        }
        while (idade> 0 );
        System.out.println("O programa repetiu "+repcount+" vezes");
    }
}
