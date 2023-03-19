import java.util.Scanner;

public class Imposto_Consumidor_Carro {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        double custo_Consumidor, custo_Fabricante;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Custo de fábrica: R$ ");
            custo_Fabricante = txt.nextDouble();

            custo_Consumidor = custo_Fabricante+((custo_Fabricante+(custo_Fabricante*0.45))*0.28);

            System.out.print("Custo para o conssumidor: R$ "+custo_Consumidor);

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }

  /*Por Lucas Pizoni Flôres
    353*/
}
