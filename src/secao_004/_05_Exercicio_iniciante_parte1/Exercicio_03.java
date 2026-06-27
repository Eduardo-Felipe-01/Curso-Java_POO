package secao_004._05_Exercicio_iniciante_parte1;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = a * b - c * d;

        System.out.println("DEFERENÇA = " + diferenca);

        sc.close();
    }
}
