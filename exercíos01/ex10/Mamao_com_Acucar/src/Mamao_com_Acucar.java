import java.util.Scanner;

public class Mamao_com_Acucar {

    public static void main (String[] args){

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        Double valor,prestacao;

        while (conf.equals("SIM") || conf.equals("S")){

            System.out.println(" ");
            System.out.print("Valor do produto: R$ ");
            valor = txt.nextDouble();

            prestacao = valor/5;

            System.out.println("O valor da prestação em 5x por mês ficará de: R$ "+prestacao);

            System.out.println(" ");
            System.out.print("Deseja continuar ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }

}
