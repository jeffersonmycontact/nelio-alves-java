package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Password: ");
        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida");
            senha = input.nextInt();
        }

        System.out.println("Acesso Permitido");
        input.close();
    }
}