package secao_006._01_Estrutura_repetitiva_enquanto_while;

import java.util.Scanner;

public class Sintaxe_while {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Somar até ser digitado "0"

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}