import java.util.Arrays;
import java.util.Scanner;
public class Nome_e_Genero {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        String[] sexo = new String[56];
        String[] nome = new String[56];
        int c,masc = 0,femi = 0;

        while (conf.equals("SIM") || conf.equals("S")) {

            for(c=0; c<56; c++){

                System.out.print("Nome: ");
                nome[c] = txt.nextLine();
                nome[c] = nome[c].toUpperCase();

                System.out.print("Gênero (F/M): ");
                sexo[c] = txt.nextLine();
                sexo[c] = sexo[c].toUpperCase();

                if(sexo[c].equals("MASCULINO") || sexo[c].equals("M")){

                    masc++;

                }

                if(sexo[c].equals("FEMININO") || sexo[c].equals("F")){

                    femi++;

                }

                System.out.println(" ");

            }

            for(c=0; c<56; c++){

                if(sexo[c].equals("MASCULINO") || sexo[c].equals("M")){

                    sexo[c] = "MASCULINO";

                }

                if(sexo[c].equals("FEMININO") || sexo[c].equals("F")){

                    sexo[c] = "FEMININO";

                }

                System.out.println(" "+nome[c]+" é "+sexo[c]);

            }

            System.out.println(" ");
            System.out.print("Há no total "+masc+" homens e "+femi+" mulheres.");

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
