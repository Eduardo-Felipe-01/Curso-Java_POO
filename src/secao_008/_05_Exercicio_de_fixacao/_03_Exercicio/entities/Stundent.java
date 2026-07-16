package secao_008._05_Exercicio_de_fixacao_de_classes_e_metodo._03_Exercicio.entities;

public class Stundent {

    public String nome;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public double notaFinal() {
        if (primeiraNota >= 0 && primeiraNota <= 30 && segundaNota >= 0 && segundaNota <= 35 && terceiraNota >=0 && terceiraNota <= 35) {
            return primeiraNota + segundaNota + terceiraNota;
        } else {
            return 0;
        }
    }

    public String statusDaAprovacao() {
        if (notaFinal() >= 60) {
            return "PASS";
        } else {
            double media = 60 - notaFinal();
            return "FAILED " + String.format("%n") + "FALTA " + media + " PONTOS";
        }
    }

    public String toString() {
        return "NOTA FINAL = " + String.format("%.2f%n", notaFinal()) + statusDaAprovacao();
    }
}
