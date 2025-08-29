package entradaDeDados;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);
        System.out.print("Valor da compra: R$");
        x = input.nextDouble();

        System.out.println("Valor total: R$" + x);
    }
}