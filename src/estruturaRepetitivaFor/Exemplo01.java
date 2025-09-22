package estruturaRepetitivaFor;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++) {
            int x = input.nextInt();
            soma += x;
        }
        System.out.println(soma);

        input.close();
    }
}