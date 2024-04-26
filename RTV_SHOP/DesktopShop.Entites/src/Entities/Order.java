package Entities;

import java.util.UUID;
public class Order {
    UUID Id=UUID.randomUUID();
    Product[] products;
    double total;
    UUID customerId;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
