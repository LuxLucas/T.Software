import java.util.Scanner;

public class Media_Aluno {

    public static void main(String[] args) {

        double nota1,nota2,nota3,media;
        String nome;
        Scanner txt;
        txt = new Scanner(System.in);

        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        media = 0;

        String conf = "Sim";
        while (conf.equals("Sim") || conf.equals("S") || conf.equals("sim") || conf.equals("s") || conf.equals("SIM")) {

            System.out.println(" ");

            System.out.print("Nome: ");
            nome = txt.nextLine();
            System.out.println(" ");

            System.out.print("Nota no 1° semestre: ");
            nota1 = txt.nextFloat();

            System.out.print("Nota no 2° semestre: ");
            nota2 = txt.nextFloat();

            System.out.print("Nota no 3° semestre: ");
            nota3 = txt.nextFloat();
            System.out.println(" ");

            media = (nota1+nota2+nota3)/3;

            System.out.println(nome+", sua média esse ano foi de: "+media);
            System.out.println(" ");

            System.out.print("Deseja continuar ? (Sim/Não) ");
            /*Parece que só "lê" o que digito se repito isso*/
            conf = txt.nextLine();
            conf = txt.nextLine();
        }

    }

}
