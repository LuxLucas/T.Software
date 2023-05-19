import java.util.Scanner;
public class Exercicio_24 {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM", carga="ZERO (NULO)";
        double num;

        while (conf.equals("SIM") || conf.equals("S")) {

            /* System.out.println(" ");
            System.out.print("Digite um número: ");
            num = txt.nextDouble();*/

            System.out.print("Digite um NÚMEROS: ");
            while (!txt.hasNextDouble()) {
                System.out.println(" ");
                System.out.println("Somente números inteiros.");
                System.out.print("Digite um número: ");
                txt.next();
            }
            num=txt.nextDouble();

            if(num > 0){
                carga = "POSITIVO";
            }else if(num < 0){
                carga = "NEGATIVO";
            }
            if(num == 0){
                carga = " 0, (NEUTRO ?)";
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
