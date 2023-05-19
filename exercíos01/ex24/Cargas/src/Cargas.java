import java.util.Scanner;
public class Cargas {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM", carga="ZERO (NULO)";
        double num;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Digite um número: ");
            num = txt.nextDouble();

            if(num > 0){
                carga = "POSITIVO";
            }else if(num < 0){
                carga = "NEGATIVO";
            }

            System.out.println(" O sinal/carga deste número é "+carga);

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
