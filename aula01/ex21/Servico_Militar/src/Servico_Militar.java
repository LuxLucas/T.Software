import java.util.Scanner;
public class Servico_Militar {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM",nome,sexo,condicao;
        Integer idade, milit=0, disp=0;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Nome: ");
            nome = txt.nextLine();
            nome = nome.toUpperCase();

            System.out.print("Gênero (M/F): ");
            sexo = txt.nextLine();
            sexo = sexo.toUpperCase();

            if(sexo.equals("M") || sexo.equals("MASCULINO")){

            sexo = "MASCULINO";

            }

            if(sexo.equals("F") || sexo.equals("FEMININO")){

                sexo = "FEMININO";

            }

            System.out.print("Saúde (Saudável/Deficiente): ");
            condicao = txt.nextLine();
            condicao = condicao.toUpperCase();

            if(condicao.equals("SAUDÁVEL") || condicao.equals("S")){

                condicao = "SAUDÁVEL";

            }

            System.out.print("Idade: ");
            idade = txt.nextInt();

            if(condicao.equals("SAUDÁVEL") && sexo.equals("MASCULINO") && idade >=18){

                System.out.println(" ");
                System.out.print("   "+nome+" está sucetível ao serviço militar.");
                milit++;

            }else{

                System.out.println(" ");
                System.out.print("   "+nome+" não está sucetível ao serviço militar.");
                disp++;

            }

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

        System.out.println(" ");
        System.out.print("Total de pessoas sucetíveis ao serviço militar: "+milit);
        System.out.print("Total de pessoas não sucetíveis ao serviço militar: "+disp);
        System.out.println(" ");

    }
  /*Por: Lucas Pizoni Flôres
    353*/

}
