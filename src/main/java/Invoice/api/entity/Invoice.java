package Invoice.api.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Invoice {

    @Id
    private String id;

    @Indexed(unique = true)
    private int invoiceNumber;

    private Dealer dealer;

    private Buyer buyer;

    private List<Product> products;

    public Invoice(int invoiceNumber, Dealer dealer, Buyer buyer, List<Product> products) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.dealer = dealer;
        this.buyer = buyer;
        this.products = products;
    }



    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Product> getProducts() {
        return products;
    }


}
