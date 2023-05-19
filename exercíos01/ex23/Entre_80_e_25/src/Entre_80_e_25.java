import java.util.Scanner;
public class Entre_80_e_25 {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        Integer num;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Digite um número: ");
            num = txt.nextInt();

            if(num>80){

                System.out.print("  "+num+" é maior que 80 .");

                }else if(num<25){

                System.out.print("  "+num+" é menor que 25 .");

            } else if (num==40) {

                System.out.print("  "+num+" é igual a 40 .");

            } else {

                System.out.print("  "+num+" não é menor que 25, não é igual a 40 e não é maior que 80 .");

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
    3-53*/

}
