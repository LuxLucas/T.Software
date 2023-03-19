import java.util.Scanner;
public class Media_Aluno_2 {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        String nome;
        double nota1,nota2,nota3,media;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Nome do aluno: ");
            nome = txt.nextLine();
            nome = nome.toUpperCase();
            System.out.println(" ");

            System.out.print("Nota do 1° semestre: ");
            nota1 = txt.nextDouble();
            System.out.print("Nota do 2° semestre: ");
            nota2 = txt.nextDouble();
            System.out.print("Nota do 3° semestre: ");
            nota3 = txt.nextDouble();

            media = (nota1+nota2+nota3)/3;

            System.out.println(" ");

            if(media >= 7){


                System.out.print(" "+nome+" foi APROVADO. Sua média é de: "+media);

            }else{

                if(media <= 5){

                    System.out.print(" "+nome+" foi REPROVADO. Sua média é de: "+media);

                }else{

                    System.out.print(" "+nome+" está em RECUPERAÇÃO. Sua média é de: "+media);

                }

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
