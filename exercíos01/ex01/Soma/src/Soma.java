import java.io.IOException;
import java.util.Scanner;

public class Soma {

    public static void main (String[] args){

        float numeroA, numeroB, res;
        Scanner txt;
        txt = new Scanner(System.in);

        numeroA = (float) 0;
        numeroB = (float) 0;

        String conf = "Sim";
        while( conf.equals("Sim") || conf.equals("S") || conf.equals("sim") || conf.equals("s") ){

            System.out.println(" ");

            System.out.print("Digite um número: ");
            numeroA = txt.nextFloat();

            System.out.print("Digite um número: ");
            numeroB = txt.nextFloat();
            System.out.println(" ");

            res = numeroA+numeroB;

            System.out.print("O resultado da soma é: "+res);
            System.out.println(" ");


            System.out.print("Deseja continuar ? (Sim/Não) ");
            /*Parece que só "lê" o que digito se repito isso*/
            conf = txt.nextLine();
            conf = txt.nextLine();
        }

    }

}
