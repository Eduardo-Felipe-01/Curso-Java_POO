package secao_006._04_Exercicio_iniciante_parte4_for;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        // Soma e mostra valores que estão dentro e fora do intervalo [10,20]

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in%n%d out", in, out);

        sc.close();
    }
}
