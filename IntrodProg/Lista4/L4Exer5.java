import java.util.Scanner;
import java.util.Arrays;

public class L4Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] alturaturma = new double[10];
        double[] alturamulheres = new double[10];
        double[] alturahomens = new double[10];
        int qntmulheres =0;

        for(int i = 0; i<10;i++){
            System.out.println("Digite seu sexo(1-masculino/2-feminino):");
            char gen = scanner.next().charAt(0);
            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();
            alturaturma[i] = altura;

            switch (gen) {
                case '1':
                    alturahomens[i] = altura;
                    break;
                case '2':
                    alturamulheres[i] = altura;
                    qntmulheres++;
                    break;
            
                default:
                System.out.println("Voce só pode digitar 1 ou 2");
                i--;
                    break;
                
            }

        }

        double somaturma =0;
        for (int e = 0;e<10;e++){
             somaturma += alturaturma[e] ;

        }
        double mediaturma = somaturma/10;

        double somamulheres=0;
        for(int m = 0 ; m<10;m++){
            somamulheres+= alturamulheres[m];
        }
        double mediamulheres = somamulheres/qntmulheres;
        

        Arrays.sort(alturamulheres);

        System.out.printf("A altura média da turma é %.2f\n",mediaturma);
        System.out.printf("A altura média das mulheres é %.2f\n",mediamulheres);
        System.out.println("A mulher mais alta é "+alturamulheres[9]);

    }
    
}
