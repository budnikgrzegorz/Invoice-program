package Invoice.api.entity;

import Invoice.api.enums.Counting;
import Invoice.api.enums.VatRate;

public class Product {

    private String name;

    private Counting counting;

    private VatRate vatRate;

    public Product(String name, Counting counting, VatRate vatRate) {
        this.name = name;
        this.counting = counting;
        this.vatRate = vatRate;
    }
}
