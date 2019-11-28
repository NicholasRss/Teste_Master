package nicholas.sousa.Atividade01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int soma;

        System.out.print("Valor de x: ");
        x = in.nextInt();
        System.out.print("Valor de y: ");
        y = in.nextInt();

        soma = x + y;

        System.out.println("Valor da soma: " + soma);

        in.close();
    }
}
