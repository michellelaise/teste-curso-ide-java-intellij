package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome = teclado.nextLine();
        double salary = teclado.nextDouble();
        double sales = teclado.nextDouble();

        double total = salary + (sales * 0.15);

        System.out.printf(Locale.US, "TOTAL = R$ %.2f\n" , total);

    }
}
