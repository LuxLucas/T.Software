import java.util.Scanner;

public class Salario_Vendedor {

    public static void main(String[] args) {

        double sal,vendas,salporc;

        String nome;
        Scanner txt;
        txt = new Scanner(System.in);

        sal = 0;
        salporc = 0;
        vendas  = 0;

        String conf = "Sim";
        while (conf.equals("Sim") || conf.equals("S") || conf.equals("sim") || conf.equals("s") || conf.equals("SIM")) {

            System.out.println(" ");

            System.out.print("Nome: ");
            nome = txt.nextLine();

            System.out.print("Salário atual (em R$): R$ ");
            sal = txt.nextFloat();

            System.out.print("Valor total das vendas feitas nesse mês (em R$): R$ ");
            vendas = txt.nextFloat();
            System.out.println(" ");

            salporc = sal + (vendas * 0.15);

            System.out.println(nome+", seu salário nesse mês será de: R$ "+salporc);
            System.out.println(" ");

            System.out.println(" ");
            System.out.print("Deseja continuar ? (Sim/Não) ");
            /*Parece que só "lê" o que digito se repito isso*/
            conf = txt.nextLine();
            conf = txt.nextLine();
        }

    }

}
