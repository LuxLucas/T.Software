import java.util.Scanner;
public class Troca {

    public static void main(String[] args) {

        Double dA, dB, dT;
        String res, sA, sB, sT, conf;
        Scanner Ler = new Scanner(System.in);

        dA = (double) 0;
        dB = (double) 0;
        dT = (double) 0;

        conf = "Sim";
        while (conf.equals("Sim") || conf.equals("S") || conf.equals("sim") || conf.equals("s") || conf.equals("SIM")) {

            System.out.println(" ");
            System.out.println("Digitará um número ou frase ? ");
            res = Ler.nextLine();
            res = res.toUpperCase();

            if (res.equals("FRASE") || res.equals("F")) {

                System.out.println(" ");
                System.out.print("Digite um valor para A: ");
                sA= Ler.nextLine();
                System.out.print("Digite um valor para B: ");
                sB= Ler.nextLine();

                System.out.println(" ");
                System.out.print("O valor de A: "+sA);
                System.out.println(" ");
                System.out.print("O valor de B: "+sB);
                System.out.println(" ");

                sT = sA;
                sA = sB;
                sB = sT;

                System.out.println(" ");
                System.out.print("   [TROCA REALIZADA]  ");
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("O valor de A: "+sA);
                System.out.print("O valor de B: "+sB);
                System.out.println(" ");
                System.out.println(" ");

            }

            if (res.equals("NÚMERO") || res.equals("N") || res.equals("NUMERO")) {

                System.out.println(" ");
                System.out.print("Digite um valor para A: ");
                dA= Ler.nextDouble();
                System.out.print("Digite um valor para B: ");
                dB= Ler.nextDouble();

                System.out.println(" ");
                System.out.print("O valor de A: "+dA);
                System.out.println(" ");
                System.out.print("O valor de B: "+dB);
                System.out.println(" ");

                dT = dA;
                dA = dB;
                dB = dT;

                System.out.println(" ");
                System.out.print("   [TROCA REALIZADA]  ");
                System.out.println(" ");

                System.out.println(" ");
                System.out.println("O valor de A: "+dA);
                System.out.print("O valor de B: "+dB);
                System.out.println(" ");
                System.out.println(" ");


            }

            System.out.print("Deseja continar (Sim/Não)? ");
            conf= Ler.nextLine();

        }

    }

}
