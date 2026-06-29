package secao_005._03_Estrutura_condicional_if_else;

import java.util.Scanner;

public class sintaxe_composta {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas hora?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa tarde");
        }

        sc.close();
    }
}
