package secao_005._03_Estrutura_condicional_if_else;

import java.util.Scanner;

public class encadeamento_de_estrutura_condicionais {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas hora?");
        hora = sc.nextInt();

        // Com o if detro do else endentado
        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else {
            if (hora < 18) {
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }
        }

        // Com o if detro do else sem está endentado
        if (hora < 12 && hora > 6) {
            System.out.println("Bom dia");
        }
        else if (hora < 18 && hora > 12) {
            System.out.println("Boa tarde");
        }
        else if (hora < 23 && hora > 18) {
            System.out.println("Boa noite");
        }
        else {
            System.out.println("Boa madrugada");
        }


        sc.close();
    }
}
