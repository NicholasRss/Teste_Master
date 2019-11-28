package nicholas.sousa;

import java.util.Scanner;

public class Baskara {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1 = 0;
        double x2 = 0;
        double Delta;

        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();

        Delta = b*b - (4*a*c);

        x1 = (-b + Math.sqrt(Delta))/(2*a);

        x2 = (-b - Math.sqrt(Delta))/(2*a);

        System.out.println("O resultado do Delta é: "+ Delta);
        if(Delta < 0) {
            System.out.println("Delta negativo com valor invalido");
        } else {
            System.out.println("O resultado do x1 é: " + x1);
            System.out.println("O resultado do x2 é: " + x2);
        }

        input.close();
    }
}
