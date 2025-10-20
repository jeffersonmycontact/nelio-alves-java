package estruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            System.out.print(i * i + " ");
            System.out.println(i * i * i);
        }

        input.close();
    }
}