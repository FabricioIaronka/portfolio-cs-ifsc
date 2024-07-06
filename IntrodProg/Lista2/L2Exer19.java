import java.util.Scanner;

public class L2Exer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor entre 0 e 999: ");
        String num = scanner.nextLine();

        String[] nums = num.split("");
        int[] intnum = new int[3];
        int soma =0;

        for(int i =0;i<3;i++){
            try{
                intnum[i] = Integer.parseInt(nums[i]);
            }
            catch(ArrayIndexOutOfBoundsException ex){
                intnum[i] = 0;
            }
            soma += intnum[i];
        }

        int x=0,y=1,z=2;
        switch (nums.length) {
            case 1:
                x=1;
                y=2;
                z=0;
                break;

            case 2:
                x=2;
                y=0;
                z=1;
                break;
        }

        System.out.println("Os numeros digitados foram: " + intnum[x] + ", " + intnum[y] + ", " + intnum[z] + ".");
        System.out.println("E a soma dos respectivos números é: " + soma);
    }

}
