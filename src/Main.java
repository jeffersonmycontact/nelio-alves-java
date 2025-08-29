import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int y = 33;
        double x = 10.35784;

        System.out.println("Hello, World! ");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x); // %.2f duas casas decimais %n é a quebra de linha \n também funciona
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US); // Se o local for Brasil, no lugar do ponto para separar os números decimais, teremos vírgula

        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", x);
        System.out.printf("Primeiro número: %d%nSegundo número: %.2f%n", y, x);

        String nome = "Maria";
        int idade = 31;
        Double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$%.2f%n", nome, idade, renda);

    }
}
