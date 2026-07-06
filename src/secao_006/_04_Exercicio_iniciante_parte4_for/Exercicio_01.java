package secao_006._04_Exercicio_iniciante_parte4_for;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        // Mostra os números impares até o número digitado

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int s = 0;

        if (x >= 1 && x <= 1000) {
            for (int i = 0; x >= i; i++) {
                s = i % 2;
                if (s != 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Digite um valor 1 á 1000");
        }
        sc.close();
    }
}
