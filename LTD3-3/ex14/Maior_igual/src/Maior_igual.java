import java.util.Scanner;
public class Maior_igual {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        Integer numero1,numero2;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Primeiro número: ");
            numero1 = txt.nextInt();
            System.out.print("Segundo número: ");
            numero2 = txt.nextInt();

            if (numero1 == numero2) {

                System.out.print(" Valores iguais. ");

            } else {

                if (numero1 > numero2) {

                    System.out.print(" " + numero1 + " é MAIOR que " + numero2+" .");

                } else {

                    System.out.print(" " + numero2 + " é MAIOR que " + numero1+" .");

                }

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