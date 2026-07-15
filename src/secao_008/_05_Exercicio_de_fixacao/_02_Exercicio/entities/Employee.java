package secao_008._05_Exercicio_de_fixacao._02_Exercicio.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        this.grossSalary += percentage / 100 * this.grossSalary;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
