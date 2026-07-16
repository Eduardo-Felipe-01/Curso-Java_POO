package secao_008._05_Exercicio_de_fixacao_de_classes_e_metodo._03_Exercicio.application;

import secao_008._05_Exercicio_de_fixacao_de_classes_e_metodo._03_Exercicio.entities.Stundent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Stundent stundent = new Stundent();
        stundent.nome = sc.nextLine();
        stundent.primeiraNota = sc.nextDouble();
        stundent.segundaNota = sc.nextDouble();
        stundent.terceiraNota = sc.nextDouble();

        System.out.println(stundent);

        sc.close();
    }
}
