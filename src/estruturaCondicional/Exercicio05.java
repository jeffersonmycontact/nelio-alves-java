package estruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigo, quantidade;
        double total;

        System.out.println("Código - Especificação - Preço");
        System.out.println("1       Cachorro-Quente     R$4.00");
        System.out.println("2       X-Salada            R$4.50");
        System.out.println("3       X-Bacon             R$5.00");
        System.out.println("4       Torrada simples     R$2.00");
        System.out.println("5       Refrigerante        R$1.50");

        System.out.println("Digite o código do item: ");
        codigo = input.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = input.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
           total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("Total a pagar: R$ %.2f%n", total);

        input.close();
    }
}