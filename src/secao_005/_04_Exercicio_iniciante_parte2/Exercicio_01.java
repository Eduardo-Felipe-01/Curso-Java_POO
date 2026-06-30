package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Saber se o número é negativo ou não

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
