package estruturaCondicional;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorPlano = 50.0;
        int minutos;

        System.out.println("Quantos minutos você consumiu: ");
        minutos = input.nextInt();

        if (minutos > 100) {
            valorPlano += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPlano);

        input.close();
    }
}