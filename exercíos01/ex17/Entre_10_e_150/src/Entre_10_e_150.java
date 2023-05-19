import java.util.Scanner;
public class Entre_10_e_150 {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        int[] num = new int[80];
        int numeros_aceitos=0;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");

            for(int c = 0; c < 80; c++){

                System.out.print("Digite o "+(c+1)+"° número: ");
                num[c] = txt.nextInt();

                if(num[c]>10 && num[c]<150){

                    numeros_aceitos+= 1;

                }

            }

            System.out.println(" ");
            System.out.print(numeros_aceitos+" numeros estão entre 10 e 150 .");

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }
  /*Por: Lucas Pizoni Flôres
    353*/

}
