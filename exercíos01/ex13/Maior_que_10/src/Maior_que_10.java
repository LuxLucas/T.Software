import  java.util.Scanner;
public class Maior_que_10 {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        double num;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Digite um número: ");
            num = txt.nextDouble();

            if(num > 10){
                System.out.print(" "+num+" é MAIOR que 10. ");
            }else{
                System.out.print(" Este número é MENOR que 10 ou É 10. ");
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
    353*/

}
