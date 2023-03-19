import java.util.Scanner;
public class Abono_Salario {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM",nome,sexo;
        int idade=0;
        double sal;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Nome do funcionário: ");
            nome = txt.nextLine();

            nome = nome.toUpperCase();

            System.out.print("Idade do funcionário: ");
            idade = txt.nextInt();

            System.out.print("Gênero do funcionário (MASCULINO/FEMININO): ");
            sexo = txt.nextLine();
            sexo = txt.nextLine();

            sexo = sexo.toUpperCase();

            System.out.print("Salário do funcionário: ");
            sal = txt.nextDouble();

            if(sexo.equals("MASCULINO") || sexo.equals("M")){

                if (idade >= 30){
                  sal = sal + 100;
                }
                if (idade < 30){
                  sal = sal + 50;
                }

            }

            if(sexo.equals("FEMININO") || sexo.equals("F")){

                if (idade >= 30){
                    sal = sal + 200;
                }
                if (idade < 30){
                    sal = sal + 80;
                }
            }

            System.out.println(" ");
            System.out.print(" "+nome+", "+" seu salário é de R$ "+sal);

            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Deseja continuar (SIM/NÃO) ?: ");
            conf = txt.nextLine();
            conf = txt.nextLine();
            conf = conf.toUpperCase();

        }

    }
  /*Por: Lucas Pizoni Flôres
    3-53*/

}
