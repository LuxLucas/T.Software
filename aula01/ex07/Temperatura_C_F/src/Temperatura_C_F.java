import java.util.Scanner;
public class Temperatura_C_F {

    public static void main (String[] args){

     Scanner txt = new Scanner(System.in);
     Double c,f;
     String conf = "SIM";

     while((conf.equals("SIM")) || (conf.equals("S"))){

         System.out.println(" ");
         System.out.print("Celsius: ");
         c = txt.nextDouble();
         f = (9*c+160)/5;
         System.out.println(c+"°C para °F fica: "+f+"°F");
         System.out.println(" ");
         System.out.print("Deseja continuar (SIM/NÃO) ? ");
         conf = txt.nextLine();
         conf = txt.nextLine();
         conf = conf.toUpperCase();

     }

    }

}
