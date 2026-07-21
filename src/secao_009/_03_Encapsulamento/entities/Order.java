package secao_009._03_Encapsulamento.entities;

import java.util.Date;

public class Order {

    // Apanas para mostrar que uma variável sem modificadores de acesso pode ser usando se estiver na mesma pasta

    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        this.date = date;
        this.product = product;
        this.product.name = "TV";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
