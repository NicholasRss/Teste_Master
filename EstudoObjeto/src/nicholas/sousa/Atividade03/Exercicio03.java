package nicholas.sousa.Atividade03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int A = 0, G = 0, D = 0;

        while (x != 4) {
            if (x == 1) {
                A += + 1;
            } else if (x == 2) {
                G += + 1;
            } else if (x == 3) {
                D += + 1;
            }
            x = in.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + A);
        System.out.println("Gasolina: " + G);
        System.out.println("Diesel: " + D);

        in.close();
    }
}
