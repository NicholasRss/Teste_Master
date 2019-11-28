package nicholas.sousa.Atividade03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("1Q");
            } else if (x < 0 && y > 0) {
                System.out.println("2Q");
            } else if (x < 0 && y < 0) {
                System.out.println("3Q");
            } else if (x > 0 && y < 0) {
                System.out.println("4Q");
            }
            x = in.nextInt();
            y = in.nextInt();
        }

        System.out.println("Nulo");

        in.close();
    }
}
