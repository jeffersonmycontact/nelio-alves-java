package usoDoDebug;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double largura = input.nextDouble();
        double comprimento = input.nextDouble();
        double metroQuadrado = input.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Área = %.2f%n", area);
        System.out.printf("Preço = R$ %.2f%n", preco);
        input.close();
    }
}