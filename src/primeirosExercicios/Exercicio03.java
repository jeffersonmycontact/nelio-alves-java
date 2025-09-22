package primeirosExercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D, dif;

        System.out.println("Valor de A: ");
        A = input.nextInt();
        System.out.println("Valor de B: ");
        B = input.nextInt();
        System.out.println("Valor de C: ");
        C = input.nextInt();
        System.out.println("Valor de D: ");
        D = input.nextInt();

        dif = ((A * B) - (C * D));

        System.out.println("Valor de [(A * B) - (C * D)] = " + dif);

        input.close();
    }
}
