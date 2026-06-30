package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Saber se o número é par ou impar

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
