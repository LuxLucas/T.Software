import java.util.Scanner;
public class Maior_de_Idade_Array {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        int[] idade = new int[75];

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");

            for(int c = 0; c < 75; c++){

                System.out.print("Digite a idade: ");
                idade[c] = txt.nextInt();

                if(idade[c]>=18){

                    System.out.println("  MAIOR de idade.");

                }else{

                    System.out.println("  MENOR de idade.");

                }

                System.out.println(" ");

            }

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
