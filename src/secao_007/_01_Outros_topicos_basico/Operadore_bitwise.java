package secao_007._01_Outros_topicos_basico;

import java.util.Scanner;

public class Operadore_bitwise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Operadores bitwise
        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);


        // Aplicação comum: verificar bit
        int mask = 0b100000;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }

        sc.close();
    }
}
