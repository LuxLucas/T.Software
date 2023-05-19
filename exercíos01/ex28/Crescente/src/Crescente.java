import java.util.Scanner;
public class Crescente {

    public static void main(String[] args) {

        Scanner txt = new Scanner(System.in);
        String conf = "SIM";
        Double num1,num2,num3,maior,menor,medio;

        while (conf.equals("SIM") || conf.equals("S")) {

            System.out.println(" ");
            System.out.print("Digite o 1° número: ");
            num1 = txt.nextDouble();

            System.out.print("Digite o 2° número: ");
            num2 = txt.nextDouble();

            System.out.print("Digite o 3° número: ");
            num3 = txt.nextDouble();

            maior = num1;
            menor = num1;
            medio = num1;

            if (num2 > maior){

                maior = num2;

            }else{

                menor = num2;

            }

            if (num3 > maior){

                maior = num3;

            }

            if(num3 < menor){

                menor = num3;

            }

            if((num1 == maior && num3 == menor)||(num3 == maior && num1 == menor )){

                medio = num2;

            } else if ((num1 == maior && num2 == menor)||(num2 == maior && num1 == menor )) {

                medio = num3;

            }

            System.out.println(" ");
            System.out.print(menor+" , "+medio+" , "+maior);

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
