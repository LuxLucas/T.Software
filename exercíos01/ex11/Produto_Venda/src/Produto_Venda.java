import  java.util.Scanner;
public class Produto_Venda {

    public static void main(String[] args){

        Scanner txt = new Scanner(System.in);
        double producao, venda, porcent;
        String conf = "SIM";

        while(conf.equals("SIM") || conf.equals("S")){

            System.out.println(" ");
            System.out.print("Preço de custo: R$ ");
            producao = txt.nextDouble();
            System.out.print("Acrescimo percentual (%): ");
            porcent = txt.nextDouble();

            venda = producao + ((producao * porcent)/100);

            System.out.println(" ");
            System.out.print("O valor de venda será de: R$ "+venda);
            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }

}
