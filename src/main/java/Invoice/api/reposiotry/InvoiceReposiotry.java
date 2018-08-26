package Invoice.api.reposiotry;

import Invoice.api.entity.Buyer;
import Invoice.api.entity.Dealer;
import Invoice.api.entity.Invoice;
import Invoice.api.entity.Product;

import java.util.List;

public interface InvoiceReposiotry {

    Integer givingAInvoiceNumber();

    Invoice addInvoice(int invoiceNumber, Dealer dealer, Buyer buyer, List<Product> products);

    void deleteInvoice(Invoice invoice);

    void getInvoice(Invoice invoice);



}
