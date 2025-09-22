package estruturaCondicional;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rendaAnual;
        double imposto;

        System.out.println("Renda anual: ");
        rendaAnual = input.nextDouble();

        if (rendaAnual <= 2000) {
            imposto = 0.0;
        } else if (rendaAnual <= 3000) {
            imposto = (rendaAnual - 2000) * 0.08;
        } else if (rendaAnual <= 4500) {
            imposto = (rendaAnual - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (rendaAnual - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        input.close();
    }
}