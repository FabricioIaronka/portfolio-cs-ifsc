import java.util.Scanner;


public class L4Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cardapio");


        System.out.println("Cachorro Quente | R$4,00  | Codigo=100");
        System.out.println("X salada        | R$6,00  | Codigo=101");
        System.out.println("Bauru com ovo   | R$6,50  | Codigo=102");
        System.out.println("Refrigerante    | R$2,00  | Codigo=103");


        int codigo = 0;
        double valor = 0;
        double conta = 0;
        
        String nome = "a";
        String[] pedidos = new String[5];
        int qntrep = 0;


        while (true) {
            System.out.println("Digite o código do lanche:");
            codigo = scanner.nextInt();


            switch (codigo) {
                case 100:
                    valor = 4.00;
                    nome = "Cachorro Quente";
                    break;


                case 101:
                    valor = 6;
                    nome="X salada";
                    break;


                case 102:
                    valor = 6.5;
                    nome="Bauru com ovo";
                    break;


                case 103:
                    valor = 2;
                    nome = "Refrigerante";
                    break;


                default:
                    System.out.println("Digite 100, 101, 102 ou 103");
                    return;


            }


            System.out.println("Qual a quantidade que você deseja:");
            int qnt = scanner.nextInt();
            valor *= qnt;
            conta += valor;

            
            pedidos[qntrep] = nome;
            qntrep++;


            System.out.println("Deseja mais alguma coisa?(S/N)");
            char question = scanner.next().charAt(0);
             if(question == 's'|| question == 'S'){

             }
             else{
                break;
             }
        }
        System.out.println("O valor do seu pedido será R$"+conta);
        System.out.println("Você pediu:");
        for(int i = 0; i<qntrep;i++) {
            System.out.println(pedidos[i]);
        }
    }
}