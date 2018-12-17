package Invoice.api.service;

import Invoice.api.entity.Buyer;
import Invoice.api.entity.Dealer;
import Invoice.api.entity.Invoice;
import Invoice.api.entity.Product;
import Invoice.api.enums.Counting;
import Invoice.api.enums.VatRate;

import java.util.List;

public interface InvoiceReposiotry {

    Integer givingAInvoiceNumber();

    Invoice addInvoice(int invoiceNumber, Dealer dealer, Buyer buyer, List<Product> products);

    void deleteInvoice(Invoice invoice);

    void getInvoice(Invoice invoice);

    void addProduct(String name, Counting counting, VatRate vatRate);


}
