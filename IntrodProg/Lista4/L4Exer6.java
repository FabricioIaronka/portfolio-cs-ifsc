import java.util.Scanner;
import java.util.Arrays;

public class L4Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Questionário do cinema");
        int[] idades = new int[20];
        char[] notas = new char[20];
        int qnta= 0,somaidades = 0,qntd=0;

        for(int i = 0; i<20;i++){
            System.out.println("Digite sua idade:");
            idades[i]= scanner.nextInt();

            System.out.println("Digite a nota que você da ao cinema(A-Ótimo | B-Bom | C-Regular | D-Ruim):");
            notas[i]= scanner.next().charAt(0);

            switch (notas[i]) {
                case 'A':
                    qnta++;
                    break;
                case 'D':
                    somaidades += idades[i];
                    qntd++;
                    break;
            
                default:
                    break;
            }
       }
       Arrays.sort(idades);
       double mediaidad = somaidades/qntd;
       int diferen = idades[19]-idades[0];

       System.out.println(qnta+" pessoas marcaram como ótimo");
       System.out.println("A média da idade das pessoas que marcaram como ruim é "+mediaidad);
       System.out.println("A diferença da idade maxima e minima dos que responderam é "+diferen);

    }
}

        

