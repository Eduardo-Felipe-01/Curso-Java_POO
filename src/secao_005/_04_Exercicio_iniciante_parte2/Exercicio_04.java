package secao_005._04_Exercicio_iniciante_parte2;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Calcular a duração de um jogo

        int duracao;
        int hi = sc.nextInt();
        int hf = sc.nextInt();

        if (hi > hf) {
            duracao = (hf + 24) - hi;
            System.out.println("O JOGO DURO " + duracao + " HORA(S)");
        }
        else if (hi < hf) {
            duracao = hf - hi;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();
    }
}
