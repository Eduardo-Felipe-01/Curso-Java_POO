package secao_005._02_Expressoes_logicas;

public class Exemplos_or {

    public static void main(String[] args){

        // O Valor ser fixo é intecional. É apenas para testar as expressões lógicas
        int x = 5;

        if (x == 10 || x <= 20) {
            System.out.println("Resultado: V");
        }
        else {
            System.out.println("Resultado: F");
        }

        if (x > 0 || x != 3) {
            System.out.println("Resultado: V");
        }
        else {
            System.out.println("Resultado: F");
        }

        if (x <= 0 || x != 3 || x != 5) {
            System.out.println("Resultado: V");
        }
        else {
            System.out.println("Resultado: F");
        }
    }
}
