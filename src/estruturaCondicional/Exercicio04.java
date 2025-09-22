package estruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startTime, endTime, duration;

        System.out.println("Horário que o jogo começou: ");
        startTime = input.nextInt();
        System.out.println("Horário que o jogo terminou: ");
        endTime = input.nextInt();

        if (startTime < endTime) {
            duration = endTime - startTime;
            System.out.println("O jogo durou " + duration + " horas");
        } else {
            duration = 24 - startTime + endTime;
            System.out.println("O jogo durou " + duration + " horas");
        }

        input.close();
    }
}