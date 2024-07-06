import java.util.Scanner;

public class L3Exer19 {
    public static void main(String[] args) {
        Scanner leiador= new Scanner(System.in);
        System.out.println("Verificador de data");


        System.out.println("Coloque a data(dd/mm/aaaa) ");
        String timeInput = leiador.nextLine();

        String[] timeComponents = timeInput.split("/");

        if (timeComponents.length != 3) {
            System.out.println("Formato errado, deve ser dd/mm/aaaa");
            return;
        }

        int dia = Integer.parseInt(timeComponents[0]);
        int mes = Integer.parseInt(timeComponents[1]);
        int ano = Integer.parseInt(timeComponents[2]);

        int meses31[] = {1,3,5,7,9,11};
        int meses30[] = {4,6,8,10,12};

        if(ano>=0&&ano<10000){

            if(mes>=0&&mes<13){

                if(mes==2&&ano%4!=0){

                    if(dia>0&&dia<29){

                        Datacorreta();
                    }
                    else{
                        Dataincorreta();
                    }
                }
                else if(mes==2 && ano%4==0){

                    if(dia>0&&dia<30){
                        Datacorreta();
                    }
                    else{
                        Dataincorreta();
                    }
                }
                else{

                    boolean mes30 = false;
                    boolean mes31 = false;

                    for(int i =0; i< meses31.length; i++){

                        if(meses31[i] == mes){
                        
                            if(dia>0&&dia<32){
                                mes31 = true;
                            }
                            break;
                        }
                        else{
                            mes31 = false;
                        }
                    
                    }
                    for( int i =0; i< meses30.length; i++){

                        if(meses30[i] == mes){

                            if(dia>0&&dia<31){

                                mes30 = true;
                            }
                            break;
                        }
                        else{
                            mes30 = false;
                        }
                    }
                    if(mes30==true||mes31==true){
                        Datacorreta();
                    }
                    else{
                        Dataincorreta();
                    }
                } 
            }
            else{
                Dataincorreta();
            }  
        }
        else{
            Dataincorreta();
        }
    }
    private static void Dataincorreta(){
        System.out.println("Sua data está incorreta");
    }
    private static void Datacorreta(){
        System.out.println("Sua data está correta");
    }
}
