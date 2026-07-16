package secao_008._05_Exercicio_de_fixacao_de_classes_e_metodo._01_Exercicio.application;

import secao_008._05_Exercicio_de_fixacao_de_classes_e_metodo._01_Exercicio.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle =  new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
