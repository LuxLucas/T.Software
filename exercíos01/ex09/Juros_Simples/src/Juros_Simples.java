import java.util.Scanner;
public class Juros_Simples {

    public static void main(String[] args){

        double deposito,juros,montante;
        String conf = "SIM";
        Scanner txt = new Scanner(System.in);

        while((conf.equals("SIM"))||(conf.equals("S"))){

            System.out.println(" ");
            System.out.print("Valor depositado: R$ ");
            deposito = txt.nextDouble();

            juros = deposito * (0.7/100);
            montante = deposito + juros;

            System.out.print("Seu rendimento após um mês será de: R$ "+montante);
            System.out.println(" ");

            juros = deposito * (6.17/100) ;
            montante = deposito + juros;

            System.out.print("Seu rendimento após um ano será de: R$ "+montante);
            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }

}
