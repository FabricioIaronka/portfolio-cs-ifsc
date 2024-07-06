import java.util.Scanner;

public class L3Exer16 {
    public static void main(String[] args) {
        Scanner leiador = new Scanner(System.in);

        System.out.println("descubra em quadrante sua cooredena está");
        System.out.println("Digite a coordenada X");
        double x = leiador.nextDouble();

        System.out.println("Digite a coordenada Y");
        double y = leiador.nextDouble();

        if(x>0&&y>0){
            System.out.println("Suas coordenadas se localizam no primeiro quadrante");
        }
        else if(x<0&&y>0){
            System.out.println("Suas coordenadas se localizam no segundo quadrante");
        }
        else if(x>0&&y<0){
            System.out.println("Suas coordenadas se localizam no quarto quadrante");
        }
        else{
            System.out.println("Suas coordenadas se localizam no terceiro quadrante");
        }
    }
}
