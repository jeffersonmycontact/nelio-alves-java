package estruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Coordenada X: ");
        double x = input.nextDouble();
        System.out.println("Coordenada Y: ");
        double y = input.nextDouble();

        if (x == y && x == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Eixo Y");
        }
        input.close();
    }
}