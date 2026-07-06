package secao_006._04_Exercicio_iniciante_parte4_for;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        // Mostra o quadrado e o cubo do 1 até o número digitado

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double q = Math.pow(i, 2.0);
            double c = Math.pow(i, 3.0);

            System.out.printf("%d %.0f %.0f%n", i, q, c);
        }

        sc.close();
    }
}
