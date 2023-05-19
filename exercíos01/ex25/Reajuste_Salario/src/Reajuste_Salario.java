import java.util.Scanner;
public class Reajuste_Salario {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM",nome;
        double salMin,salFunc,salAlt;
        Integer c;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Qual o salário mínimo  ?: ");
            salMin = txt.nextDouble();

            for(c=1;c<=584;c++){

                System.out.println(" ");
                System.out.println("********************************************************************** ");

                System.out.print("Nome do funcionário: ");
                nome = txt.nextLine();
                nome = txt.nextLine();

                nome = nome.toUpperCase();

                System.out.print("Salário do funcionário: ");
                salFunc = txt.nextDouble();

                if(salFunc < (salMin*3)){

                    salAlt = salFunc+(salFunc * 0.50);

                }else if (salFunc >= (salMin*3) && salFunc <= (salMin*10)){

                    salAlt = salFunc+(salFunc * 0.20);

                }else if (salFunc > (salMin*10) && salFunc <= (salMin*20)){

                    salAlt = salFunc+(salFunc * 0.15);

                }else {

                    salAlt = salFunc+(salFunc * 0.10);

                }

                System.out.println("********************************************************************** ");
                System.out.println(nome+", seu salário de R$ "+salFunc+" será de R$ "+salAlt);
                System.out.println("A alteração  na folha de pagamenteo foi de R$ "+(salAlt-salFunc));

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
