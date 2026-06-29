package secao_005._02_Expressoes_logicas;

public class Exemplos_not {

    public static void main(String[] args){

        // O Valor ser fixo é intecional. É apenas para testar as expressões lógicas
        int x = 5;

        if (!(x == 10)) {
            System.out.println("Resultado: V");
        }
        else {
            System.out.println("Resultado: F");
        }

        if (!(x >= 2)) {
            System.out.println("Resultado: V");
        }
        else {
            System.out.println("Resultado: F");
        }

        if (!(x <= 20 && x == 10)) {
            System.out.println("Resultado: V");
        }
        else {
            System.out.println("Resultado: F");
        }
    }
}
