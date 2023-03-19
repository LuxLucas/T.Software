import java.util.Scanner;

public class Calculo {

    public static void main (String[] args){

        float numeroA, numeroB, soma, mult, sub, div;
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

            soma = numeroA+numeroB;
            mult = numeroA*numeroB;
            sub  = numeroA-numeroB;
            div  = numeroA/numeroB;

            System.out.println(" ");
            System.out.print("O resultado da soma(+) de "+numeroA+" com "+numeroB+" é: "+soma);
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("O resultado da multiplicação (*) de "+numeroA+" com "+numeroB+" é: "+mult);
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("O resultado da subtração (-) de "+numeroA+" com "+numeroB+" é: "+sub);
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("O resultado da divisão (/) de "+numeroA+" com "+numeroB+" é: "+div);
            System.out.println(" ");

            System.out.print("Deseja continuar ? (Sim/Não) ");
            /*Parece que só "lê" o que digito se repito isso*/
            conf = txt.nextLine();
            conf = txt.nextLine();
        }

    }


}
