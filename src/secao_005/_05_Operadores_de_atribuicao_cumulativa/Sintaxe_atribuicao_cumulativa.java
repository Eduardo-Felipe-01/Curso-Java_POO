package secao_005._05_Operadores_de_atribuicao_cumulativa;

import java.util.Scanner;

public class Sintaxe_atribuicao_cumulativa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r1, r2, r3, r4, r5, s1, s2, s3, s4, s5;
        int a = sc.nextInt();
        int b = sc.nextInt();

        r1 = a += b;
        r2 = a -= b;
        r3 = a *= b;
        r4 = a /= b;
        r5 = a %= b;

        s1 = a = a + b;
        s2 = a = a - b;
        s3 = a = a * b;
        s4 = a = a / b;
        s5 = a = a % b;

        System.out.printf(" a = %d%n a = %d%n a = %d%n a = %d%n a = %d%n", r1, r2, r3, r4, r5);
        System.out.println();
        System.out.printf(" a = %d%n a = %d%n a = %d%n a = %d%n a = %d%n", s1, s2, s3, s4, s5);


        sc.close();
    }
}
