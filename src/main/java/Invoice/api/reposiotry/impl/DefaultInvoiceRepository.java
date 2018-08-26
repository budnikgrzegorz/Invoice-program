package Invoice.api.reposiotry.impl;

import Invoice.api.entity.Buyer;
import Invoice.api.entity.Dealer;
import Invoice.api.entity.Invoice;
import Invoice.api.entity.Product;
import Invoice.api.reposiotry.InvoiceReposiotry;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DefaultInvoiceRepository implements InvoiceReposiotry {

    @Override
    public Integer givingAInvoiceNumber() {
        return null;
    }

    @Override
    public Invoice addInvoice(int invoiceNumber, Dealer dealer, Buyer buyer, List<Product> products) {
        return null;
    }

    @Override
    public void deleteInvoice(Invoice invoice) {

    }

    @Override
    public void getInvoice(Invoice invoice) {

    }
}
