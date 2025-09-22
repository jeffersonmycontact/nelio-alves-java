package estruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Combustível abastecido:\n1. Álcool\n2. Gasolina\n3.Diesel\n4. Fim");

        int combustivel = input.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool++;
            } else if (combustivel == 2) {
                gasolina++;
            } else if (combustivel == 3) {
                diesel++;
            } else {
                System.out.println("Código Inválido");
            }
            combustivel = input.nextInt();
        }
        System.out.printf("MUITO OBRIGADO%nÁlcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
        input.close();
    }
}