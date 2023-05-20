import java.util.Scanner;
public class LTD3_1 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println(" ");
            System.out.print("Digite um número: ");
            while (!sc.hasNextInt()) {
                System.out.println(" ");
                System.out.println("Somente números inteiros.");
                System.out.print("Digite um número: ");
                sc.next();
            }

            System.out.println(" ");
            int num = sc.nextInt();
            System.out.println("O número digitado é: " + num);

            sc.close();
        }

}


