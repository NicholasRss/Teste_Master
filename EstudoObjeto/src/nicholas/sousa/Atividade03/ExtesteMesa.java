package nicholas.sousa.Atividade03;

import java.util.Scanner;

public class ExtesteMesa {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        while (x != 2002) {
            System.out.println("Senha inválida.");
            x = in.nextInt();
        }
        System.out.println("Acesso Permetido.");



        in.close();
    }
}
