package secao_006._04_Exercicio_iniciante_parte4_for;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        // Calcula todos os divisores do número digitado

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
