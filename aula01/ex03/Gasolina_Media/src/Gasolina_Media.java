import java.util.Scanner;

public class Gasolina_Media {

    public static void main(String[] args) {

        float dist, comb, kl;
        Scanner txt;
        txt = new Scanner(System.in);

        dist = (float) 0;
        comb = (float) 0;

        String conf = "Sim";
        while (conf.equals("Sim") || conf.equals("S") || conf.equals("sim") || conf.equals("s")) {

            System.out.println(" ");

            System.out.print("Digite a distância percorrida (em quilômetros): ");
            dist = txt.nextFloat();

            System.out.print("Digite os litros de combustível utilizado (em litros): ");
            comb = txt.nextFloat();
            System.out.println(" ");

            kl = dist/comb;

            System.out.println("A média de consumo é: ");
            System.out.print(dist+"km dividido por "+comb+" litros = "+kl+" km por litro (K/L).");
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("Deseja continuar ? (Sim/Não) ");
            /*Parece que só "lê" o que digito se repito isso*/
            conf = txt.nextLine();
            conf = txt.nextLine();
        }

    }
}
