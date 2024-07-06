import java.util.Scanner;

public class L3Exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Definição de triângulos");

        System.out.println("Digite o primeiro lado do triângulo");
        int  l1 = scanner.nextInt();

        System.out.println("Digite o segundo lado do triângulo");
        int  l2 = scanner.nextInt();

        System.out.println("Digite o terceiro lado do triângulo");
        int  l3 = scanner.nextInt();

        if(l1+l2>=l3 && l2+l3>=l1 && l1+l3>=l2){
            if(l1==l2&&l1==l3&&l2==l3){
                System.out.println("Esse triângulo é equilátero");
            }
            else if(l1==l2||l1==l3||l2==l3){
                System.out.println("Esse triângulo é isóceles");
            }
            else{
                System.out.println("Esse triângulo é escaleno");
            }
        }
        else {
            System.out.println("Esse triângulo não existe");
        }
    }
}
