package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Saber se os números digitado são multiplos

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b && a % b == 0 || a < b && b % a == 0) {
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não São Multiplos");
        }

        sc.close();
    }
}
