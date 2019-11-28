package nicholas.sousa.Atividade01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double raio;
        double A;

        System.out.print("Informe o valor do raio: ");
        raio = in.nextDouble();

        A = Math.pow(raio, 2) * 3.14159;

        System.out.printf("Valor da area: %.4f", A);

        in.close();
    }
}
