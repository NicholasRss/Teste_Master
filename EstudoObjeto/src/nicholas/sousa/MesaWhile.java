package nicholas.sousa;

import java.util.Scanner;

public class MesaWhile {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int soma = 0;

        while(x != 0) {
            soma += x;
            x = in.nextInt();
        }

        System.out.println(soma);

        in.close();
    }
}
