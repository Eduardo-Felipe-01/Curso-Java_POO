package secao_006._04_Exercicio_iniciante_parte4_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        // Calcula a media com pesos diferente em cada nota

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
