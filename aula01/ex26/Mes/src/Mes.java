import java.util.Scanner;
public class Mes {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        Integer mes;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Digite um número correspondente a um mês: ");
            mes = txt.nextInt();

            switch (mes){

                case 1:
                    System.out.println("  JANEIRO ");
                break;

                case 2:
                    System.out.println("  FEVEREIRO ");
                break;

                case 3:
                    System.out.println("  MARÇO ");
                break;

                case 4:
                    System.out.println("  ABRIL ");
                break;

                case 5:
                    System.out.println("  MAIO ");
                break;

                case 6:
                    System.out.println("  JUNHO ");
                break;

                case 7:
                    System.out.println("  JULHO ");
                break;

                case 8:
                    System.out.println("  AGOSTO ");
                break;

                case 9:
                    System.out.println("  SETEMBRO ");
                break;

                case 10:
                    System.out.println("  OUTUBRO ");
                break;

                case 11:
                    System.out.println("  NOVEMBRO ");
                break;

                case 12:
                    System.out.println("  DEZEMBRO ");
                break;

                default:System.out.println(" [ERRO] Mês não encontrado ou não existente. ");

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
