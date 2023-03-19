import java.util.Scanner;
public class Dolar {

    public static void main (String[] args){

        double dolar,cotacao,real;
        String conf = "SIM";
        Scanner txt = new Scanner(System.in);

        while((conf.equals("SIM"))||(conf.equals("S"))){

            System.out.println(" ");
            System.out.print("Cotação atual do dólar: ");
            cotacao = txt.nextDouble();
            System.out.print("Quantos dólares tens ? : ");
            dolar = txt.nextDouble();

            real = cotacao*dolar;

            System.out.println("Você atualemente possui: R$ "+real);
            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO)?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }

}
