package operadoresBitwise;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mask = 0b00100000; // vamos testas o 6º bit, contamos da direita para esquerda
        int n = input.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }

        input.close();
    }
}