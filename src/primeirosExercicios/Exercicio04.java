package primeirosExercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int funcionarioNum, funcionarioHorasMes;;
        double funcionarioValorHora, salary;

        funcionarioNum = input.nextInt();
        funcionarioHorasMes = input.nextInt();
        funcionarioValorHora = input.nextDouble();

        salary = funcionarioHorasMes * funcionarioValorHora;

        System.out.printf("NUMBER = %d%nSALARY = U$%.2f%n", funcionarioNum, salary);

        input.close();
    }
}