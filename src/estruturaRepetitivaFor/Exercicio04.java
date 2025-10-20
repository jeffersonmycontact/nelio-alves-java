package estruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double resultado;

        for (int i = 0; i < n; i++) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            if (b == 0) {
                System.out.println("Divisão impossível");
            } else {
                resultado = a / b;
                System.out.println(resultado);
            }
        }

        input.close();
    }
}