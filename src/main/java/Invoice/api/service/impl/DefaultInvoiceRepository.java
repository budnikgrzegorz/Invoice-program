package Invoice.api.service.impl;

import Invoice.api.entity.Buyer;
import Invoice.api.entity.Dealer;
import Invoice.api.entity.Invoice;
import Invoice.api.entity.Product;
import Invoice.api.enums.Counting;
import Invoice.api.enums.VatRate;
import Invoice.api.service.InvoiceReposiotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DefaultInvoiceRepository implements InvoiceReposiotry extends {

    @Autowired
    private Invoice invoice;

    @Override
    public Integer givingAInvoiceNumber() {
        return null;
    }

    @Override
    public Invoice addInvoice(int invoiceNumber, Dealer dealer, Buyer buyer, List<Product> products) {
        Invoice invoice = new Invoice(invoiceNumber, dealer, buyer, products);
        return invoice;
    }

    @Override
    public void deleteInvoice(Invoice invoice) {


    }

    @Override
    public void getInvoice(Invoice invoice) {

    }

    @Override
    public void addProduct(String name, Counting counting, VatRate vatRate) {
        Product product = new Product(name,counting, vatRate);
        invoice.getProducts().add(product);
    }


}
