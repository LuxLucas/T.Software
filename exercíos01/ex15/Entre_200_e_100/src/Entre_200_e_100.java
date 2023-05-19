import java.util.Scanner;
public class Entre_200_e_100 {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        double numero;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Digite um número: ");
            numero = txt.nextDouble();

            if (numero>100 && numero<200){

                System.out.print(" "+numero+" está entre 100 e 200 .");

            }else{

                System.out.print(" "+numero+" não está entre 100 e 200 .");

            }

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
