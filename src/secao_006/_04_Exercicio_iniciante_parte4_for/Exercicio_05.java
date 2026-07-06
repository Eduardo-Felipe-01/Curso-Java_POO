package secao_006._04_Exercicio_iniciante_parte4_for;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        // Calcula numero fatorial

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);

        sc.close();
    }
}
