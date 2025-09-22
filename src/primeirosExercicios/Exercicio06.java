package primeirosExercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        Scanner input = new Scanner(System.in);

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        areaTriangulo = (A * C) / 2.0;
        areaCirculo = 3.14159 * Math.pow(C, 2.0);
        areaTrapezio = (A + B) * C / 2.0;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        input.close();
    }
}