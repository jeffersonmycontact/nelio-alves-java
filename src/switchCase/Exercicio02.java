package switchCase;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operador;
        double num1, num2;
        double resultado = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();
        System.out.println("Escolha uma operação (1-4):\n1 +\n2 -\n3 /\n4 *");
        operador = input.nextInt();

        switch (operador) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 / num2;
                break;
            case 4:
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }
        System.out.printf("Resultado: %.3f%n", resultado);
        input.close();
    }
}