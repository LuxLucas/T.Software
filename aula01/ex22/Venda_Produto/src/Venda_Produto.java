import java.util.Scanner;
public class Venda_Produto {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM",res;
        double venda,custo,medv = 0,medc = 0;
        Integer c;

        while (conf.equals("SIM") || conf.equals("S")) {

            for(c=1;c<=40;c++){

                System.out.println(" ");

                System.out.print("Valor de CUSTO do produto: ");
                custo = txt.nextDouble();
                medc = medc + custo;

                System.out.print("Valor de VENDA do produto: ");
                venda = txt.nextDouble();
                medv = medv + venda;

                if(custo>venda){

                    res = "PREJUÍZO";

                }else{

                    res = "LUCRO";

                } if(custo==venda){

                    res = "EMPATE";

                }

                System.out.print(" "+" Essa venda gerou um "+res+" .");
                System.out.println(" ");
            }

            medc = medc/40;
            medv = medv/40;

            System.out.println(" ");
            System.out.println("Média de custo: "+medc);
            System.out.print("Média de venda: "+medv);

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();
            System.out.println(" ");

        }

    }
  /*Por: Lucas Pizoni Flôres
    3-53*/

}
