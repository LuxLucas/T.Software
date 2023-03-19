import java.util.Scanner;
public class Carango_Velho {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        Integer ano = 0,ano_1999 = 0;
        double valor;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Ano do carro: ");
            ano = txt.nextInt();
            System.out.print("Valor do carro: ");
            valor = txt.nextDouble();
            System.out.println(" ");

            if (ano <=2000) {

                System.out.println("O desconto do carro será de 12% . ");

                valor = valor-(valor*0.12);
                ano_1999++;

                System.out.println("O valor ficará: "+valor);

            }else{

                System.out.println("O desconto do carro será de 7% . ");

                valor = valor-(valor*0.07);

                System.out.println("O valor ficará: "+valor);

            }

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

        System.out.println(" ");
        System.out.print("Total de carros até 2000: "+ano_1999);
        System.out.println(" ");

    }
  /*Por: Lucas Pizoni Flôres
    353*/

}
