package secao_006._04_Exercicio_iniciante_parte4_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            if (v2 != 0) {
                double r = (double) v1 / v2;
                System.out.printf("%.1f%n", r);
            } else {
                System.out.println("Divisão Impossível");
            }
        }

        sc.close();
    }
}
