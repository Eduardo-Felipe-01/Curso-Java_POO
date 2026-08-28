package secao_010._03_Exercicio_de_fixacao_vetores._01_ex_negativos;

import java.util.Scanner;

public class Program {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int contador = sc.nextInt();
        int[] vect = new int[contador];

        for(int i=0; i<contador; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();

        }

        System.out.println("NÚMEROS NEGATIVOS: ");

        for(int i=0; i<contador; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
